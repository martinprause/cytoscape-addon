import {PolymerElement} from '@polymer/polymer/polymer-element.js';
import cytoscape from "./cytoscape.min.js" 
import cxtmenu from './cytoscape-cxtmenu.js';
import edgehandles from './cytoscape-edgehandles.js';


class CytoscapeElement extends PolymerElement {

  
	static get properties () {
	    return {
	      cy: {
	        type: Object,
	        value: null
	      },
		  dragXCoordinate:{
			type: Number,
			value:0
	 	  },
		  dragYCoordinate:{
			type: Number,
			value:0
	 	  },
		  dragObject:{
			type: String,
			value: null
	 	  }
	    };
	 }

   
	 
	static get is() {
		return 'cytoscape-element';
	 }

 	constructor() {
    	super();
		let l=window.Vaadin.Flow.dndConnector.__ondropListener;
		window.Vaadin.Flow.dndConnector.__ondropListener=function(e){
			this.unitx=e.currentTarget.getBoundingClientRect().width/this.cy.extent().w;
			this.unity=e.currentTarget.getBoundingClientRect().height/this.cy.extent().h;
			this.dragXCoordinate=((e.clientX-e.currentTarget.getBoundingClientRect().x)/this.unitx+this.cy.extent().x1);
			this.dragYCoordinate=((e.clientY-e.currentTarget.getBoundingClientRect().y)/this.unity+this.cy.extent().y1);;
		    l(e);
			this.dispatchEvent(new CustomEvent("dragEvent",this._createDragEvent()));
		}
  	}

	ready(){
	    super.ready();
		cytoscape.use( cxtmenu );
		cytoscape.use( edgehandles ); 
		
		var mythis=this;

		var mycy = cytoscape({
	        
	        container: document.getElementById('cy'), 

			elements: [],	
	        layout: {
	          name: 'preset'
	        }
	      
	    });

		
		
		
		this.cy=mycy;
  	}

	registerEdgeHandling(parameter){
		let e=JSON.parse(parameter);
		var mythis=this;
		
		let defaults = {
			
			  preview: e.preview, // true,  whether to show added edges preview before releasing selection
			  hoverDelay: e.hoverDelay, // 150, time spent hovering over a target node before it is considered selected
			  handleNodes: e.handleNodes, // 'node' selector/filter function for whether edges can be made from a given node
			  snap: false, // when enabled, the edge can be drawn by just moving close to a target node
			  snapThreshold: 50, // the target node must be less than or equal to this many pixels away from the cursor/finger
			  snapFrequency: 15, // the number of times per second (Hz) that snap checks done (lower is less expensive)
			  noEdgeEventsInDraw: false, // set events:no to edges during draws, prevents mouseouts on compounds
			  disableBrowserGestures: true, // during an edge drawing gesture, disable browser gestures such as two-finger trackpad swipe and pinch-to-zoom

		
			  handlePosition: function( node ){
			    return e.handlePosition; // 'middle top' sets the position of the handle in the format of "X-AXIS Y-AXIS" such as "left top", "middle top"
			  },
			  handleInDrawMode: false, // whether to show the handle in draw mode
			  edgeType: function( sourceNode, targetNode ){
			    // can return 'flat' for flat edges between nodes or 'node' for intermediate node between them
			    // returning null/undefined means an edge can't be added between the two nodes
			    return 'flat';
			  },
			  loopAllowed: function( node ){
			    // for the specified node, return whether edges from itself to itself are allowed
			    return false;
			  },
			  nodeLoopOffset: -50, // offset for edgeType: 'node' loops
			  nodeParams: function( sourceNode, targetNode ){
			    // for edges between the specified source and target
			    // return element object to be passed to cy.add() for intermediary node
			    return {};
			  },
			  edgeParams: function( sourceNode, targetNode, i ){
			    // for edges between the specified source and target
			    // return element object to be passed to cy.add() for edge
			    // NB: i indicates edge index in case of edgeType: 'node'
			    return {};
			  },
			  ghostEdgeParams: function(){
			    // return element object to be passed to cy.add() for the ghost edge
			    // (default classes are always added for you)
			    return {};
			  },
			  show: function( sourceNode ){
			    // fired when handle is shown
			  },
			  hide: function( sourceNode ){
			    // fired when the handle is hidden
			  },
			  start: function( sourceNode ){
			    // fired when edgehandles interaction starts (drag on handle)
			  },
			  complete: function( sourceNode, targetNode, addedEles ){
			    // fired when edgehandles is done and elements are added
				mythis.dispatchEvent(new CustomEvent("edgeAddedEvent",mythis._createEdgeAddedEvent(sourceNode,targetNode,addedEles)));
			  },
			  stop: function( sourceNode ){
			    // fired when edgehandles interaction is stopped (either complete with added edges or incomplete)
			  },
			  cancel: function( sourceNode, cancelledTargets ){
			    // fired when edgehandles are cancelled (incomplete gesture)
			  },
			  hoverover: function( sourceNode, targetNode ){
			    // fired when a target is hovered
				
			  },
			  hoverout: function( sourceNode, targetNode ){
			    // fired when a target isn't hovered anymore
				
			  },
			  previewon: function( sourceNode, targetNode, previewEles ){
			    // fired when preview is shown
			  },
			  previewoff: function( sourceNode, targetNode, previewEles ){
			    // fired when preview is hidden
			  },
			  drawon: function(){
			    // fired when draw mode enabled
			  },
			  drawoff: function(){
			    // fired when draw mode disabled
			  }
			};
			
		
		this.cy.edgehandles( defaults );
	}

    registerContextMenu(context) {
		let e=JSON.parse(context);
		var mythis=this;
		let mycommands = new Array(e.commands.length);
		for (let i in e.commands) {
			mycommands[i]={	
				        content: e.commands[i],
						select: function(ele){
							mythis.dispatchEvent(new CustomEvent("actionEvent",mythis._createActionEvent(e.commands[i],ele.id())));
						}
					}
		}
		
		let contextMenu= {
			selector: e.selector,
			commands: mycommands
		}
		
		this.cy.cxtmenu(contextMenu)
	
	}

	registerEvent(event,selector) {
		let mythis=this;
		mythis.cy.on(event, selector, function(evt){
			let element = evt.target;
			mythis.dispatchEvent(new CustomEvent("customEvent",mythis._createCustomEvent(event,selector,element.jsons())));
		});
	}
 
	deleteAll() {
		let nodes = this.cy.$("*");
		this.cy.remove(nodes); 
		this.dispatchEvent(new CustomEvent("successEvent",this._createSuccessEvent("deleteAll")));
	}

	addNode(node){
		let n=JSON.parse(node);
		this.cy.add(n);
		this.dispatchEvent(new CustomEvent("nodeHasBeenAddedEvent",this._nodeAddedEvent(n)));
	}
	
	addEdge(edge) {
		let e=JSON.parse(edge);
		this.cy.add(e);
		this.dispatchEvent(new CustomEvent("edgeHasBeenAddedEvent",this._edgeAddedEvent(e)));
		
	}
	
	deleteNode(id) {
		let collection = this.cy.nodes(`[id = "${id}"]`);
		this.cy.remove(collection); 
		this.dispatchEvent(new CustomEvent("successEvent",this._createSuccessEvent("deleteNode")));
	}
	
	deleteEdge(id) {
		let collection = this.cy.edges(`[id = "${id}"]`);
		this.cy.remove(collection); 
		this.dispatchEvent(new CustomEvent("successEvent",this._createSuccessEvent("deleteEdge")));
	}

	deleteSelectedElements() {
		let collection = this.cy.$(':selected');
		this.cy.remove(collection); 
		this.dispatchEvent(new CustomEvent("successEvent",this._createSuccessEvent("deleteSelectedElements")));
	}

	_createSuccessEvent(name) {
		return {detail: {method: name}};
	}

	_createDragEvent() {
		return {detail: {dragObject: this.dragObject, dragXCoordinate: this.dragXCoordinate, dragYCoordinate : this.dragYCoordinate }};
		
	}
	
	
	_createCustomEvent(eventName,selector,event) {
		return {detail: {event: eventName, selector:selector, data: event}};
	}
	
	_createActionEvent(name,id){
		return {detail: {action: name, id:id}};
	 }

	_nodeAddedEvent(node) {
		return {detail: node};
	}

	_edgeAddedEvent(edge) {
		return {detail: edge};
	}

	
	_createEdgeAddedEvent(sourceNode, targetNode, addedEles) {
		let data = {
			source: sourceNode.jsons(),
			target: targetNode.jsons(),
			edge: addedEles.jsons()
		}
		return {detail: data};
	}

	loadGraph(elements){
		this.cy.json(JSON.parse(elements));	
		this.cy.fit();
		this.dispatchEvent(new CustomEvent("successEvent",this._createSuccessEvent("loadGraph")));
	}
	
	loadStyles(styles){
		this.cy.json(JSON.parse(styles));	
		this.cy.fit();
		this.dispatchEvent(new CustomEvent("successEvent",this._createSuccessEvent("loadStyles")));
	}
	
	loadLayout(layout){
		this.cy.json(JSON.parse(layout));	
		this.cy.fit();
		this.dispatchEvent(new CustomEvent("successEvent",this._createSuccessEvent("loadLayout")));
	}

 
	exportGraph(){
  		return  this.cy.json(true);
	}
	
	centerGraph(){
  		this.cy.fit();
		this.dispatchEvent(new CustomEvent("successEvent",this._createSuccessEvent("centerGraph")));
	}
	
	selectedElements(selector){
		let nodes = this.cy.$(selector);
		return nodes.jsons();
	}
	
	setData(id,data){
		let element = this.cy.getElementById(id);
		element.data(JSON.parse(data));
	}

}

customElements.define(CytoscapeElement.is, CytoscapeElement);


