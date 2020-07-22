package de.xinblue.cytoscape;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.page.PendingJavaScriptResult;
import com.vaadin.flow.shared.Registration;

import de.xinblue.cytoscape.events.CytoscapeActionEvents;
import de.xinblue.cytoscape.events.CytoscapeCustomEvents;
import de.xinblue.cytoscape.events.CytoscapeDragEvents;
import de.xinblue.cytoscape.events.CytoscapeEdgeAddedEvent;
import de.xinblue.cytoscape.events.CytoscapeEdgeHasBeenAddedEvent;
import de.xinblue.cytoscape.events.CytoscapeNodeHasBeenAddedEvent;
import de.xinblue.cytoscape.events.CytoscapeSuccessEvents;
import de.xinblue.cytoscape.model.Edge;
import de.xinblue.cytoscape.model.Node;
import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

@Tag("cytoscape-element")
@JsModule("./cytoscape/cytoscape-element.js")
public class Cytoscape extends Div {

	/*
	 * Constructor. Set the element ID to "cy" which is later recognized via document.getElementById('cy')
	 * 
	 */
	public Cytoscape() {
		this.setId("cy");
	}
	
	/*
	 * This method is called by the source object in a drag start event to identify the object being dragged. 
	 * @param dragObject Any drag object identifier 
	 */
    public void setDragObject(String dragObject) {
    	getElement().setProperty("dragObject", dragObject); 
    }
    
	/*
	 * Load a new graph based on the String representation of a JsonArray
	 * @param elements The Json string of elements e.g.: 
	 * [
	      {
	         "data":{
	            "id":"d",
	            "name":"Name D",
	         },
	         "position":{
	            "x":0,
	            "y":0
	         },
	         "group":"nodes",
	      },
	      {
	         "data":{
	            "id":"b",
	            "name":"Name B"
	         },
	         "position":{
	            "x":-31.92,
	            "y":-0.23999999999999932
	         },
	         "group":"nodes",
	      },
	      {
	         "data":{
	            "id":"db",
	            "source":"d",
	            "target":"b"
	         },
	         "position":{
	            "x":0,
	            "y":0
	         },
	         "group":"edges",
	      }
	    ]
	 */
    public void loadGraph(String elements) {
    	getElement().callJsFunction("loadGraph",elements);
    }
    
    /*
     * Exports the entire graph, which includes elements and styles and properties. Calls SuccessListener.
     * Example call: exportGraph().then(e -> System.out.println(e.toJson()));
     * return A Json Object of the entire graph
     * Example:
     * {
		   "elements":[
		
		   ],
		   "style":[
		      {
		         "selector":"node",
		         "style":{
		            "background-color":"rgb(204,0,0)",
		            "label":"data(id)"
		         }
		      },
		      {
		         "selector":"edge",
		         "style":{
		            "width":"2px",
		            "line-color":"rgb(0,0,204)",
		            "line-style":"dotted"
		         }
		      },
		      {
		         "selector":".eh-handle",
		         "style":{
		            "width":"8px",
		            "height":"8px",
		            "background-color":"rgb(0,0,204)",
		            "text-opacity":"0"
		         }
		      },
		      {
		         "selector":"node:selected",
		         "style":{
		            "background-color":"rgb(0,204,0)"
		         }
		      }
		   ],
		   "data":{
		
		   },
		   "zoomingEnabled":true,
		   "userZoomingEnabled":true,
		   "zoom":1,
		   "minZoom":1.0E-50,
		   "maxZoom":1.0E50,
		   "panningEnabled":true,
		   "userPanningEnabled":true,
		   "pan":{
		      "x":0,
		      "y":0
		   },
		   "boxSelectionEnabled":true,
		   "renderer":{
		      "name":"canvas"
		   }
		}
     * 
     */
    public PendingJavaScriptResult exportGraph() {
    	return getElement().callJsFunction("exportGraph");
    }
    
    /*
     * Exports the selected elements
     * Example: getSelectedElements().then(e -> System.out.println(e.toJson()));
     * return A JsonArray of the selected elements
     * [
		   {
		      "data":{
		         "id":"d",
		         "name":"Name D",
		         "type":"triangle"
		      },
		      "position":{
		         "x":24.950427779520975,
		         "y":-6.157637625074084
		      },
		      "group":"nodes",
		   },
		   {
		      "data":{
		         "id":"b",
		         "name":"Name B"
		      },
		      "position":{
		         "x":-29.42870968866576,
		         "y":-9.916195655963463
		      },
		      "group":"nodes",
		   }
		]
     * 
     * 
     */
    public PendingJavaScriptResult getSelectedElements() {
    	return getElement().callJsFunction("selectedElements",":selected");
    }
    
    /*
     * Load styles for the Cytograph object as a JsonArray. Calls SuccessListener.
     * @param styles String representation of a JsonArray
     * [
	      {
	         "selector":"node",
	         "style":{
	            "background-color":"rgb(204,0,0)",
	            "label":"data(id)"
	         }
	      },
	      {
	         "selector":"edge",
	         "style":{
	            "width":"2px",
	            "line-color":"rgb(0,0,204)",
	            "line-style":"dotted"
	         }
	      },
	      {
	         "selector":".eh-handle",
	         "style":{
	            "width":"8px",
	            "height":"8px",
	            "background-color":"rgb(0,0,204)",
	            "text-opacity":"0"
	         }
	      },
	      {
	         "selector":"node:selected",
	         "style":{
	            "background-color":"rgb(0,204,0)"
	         }
	      }
	   ]
     */

    public void loadStyle(String styles) {
    	getElement().callJsFunction("loadStyles",styles);
    }    
    public PendingJavaScriptResult getZoomAndPan() {
    	return getElement().callJsFunction("getZoomAndPan");
    }
    public void setViewport(String viewport) {
    	getElement().callJsFunction("setViewport",viewport);
    }
    
    
    private void registerContextMenu(String context) {
    	getElement().callJsFunction("registerContextMenu",context);
    }
    
    /*
     * Create a context menu for specific elements (node, edge). Calls actionEvent for each defined menuItem. Refer to https://github.com/cytoscape/cytoscape.js-cxtmenu 
     * @param selector
     * @param menuItems[] List of menuItems
     */
    public void createContextMenu(String elementId, String[] menuItems) {
      ObjectMapper objectMapper = new ObjectMapper();	
   	  ObjectNode contextBody=objectMapper.createObjectNode();
   	  //Selector: node or edge
   	  contextBody.put("selector", elementId);
   	    
   	  ArrayNode commandsArray = contextBody.putArray("commands");
   	  for (String i:menuItems) {
   		  commandsArray.add(i);
   	  }
   	     
   	  try {
   		String s=objectMapper.writeValueAsString(contextBody);
   		this.registerContextMenu(s);
   	  } catch (JsonProcessingException e1) {
   			e1.printStackTrace();
   	  } 
    }
    
    /*
     * Add Edge Handling to the Graph using a JsonObject as a String. Refer to https://github.com/cytoscape/cytoscape.js-edgehandles
     * @param edgeHandling JsonObject as String
     * Example:
     * {
     * 	 preview:true,
     *   hoverDelay:150,
     *   handleNodes:"node",
     *   handlePosition: "middle top"
     * }
     * 
     */
    public void registerEdgeHandling(String edgeHandling) {
    	getElement().callJsFunction("registerEdgeHandling",edgeHandling);
    }
    
    
    /*
     * Add Edge Handling to the Graph using standard properties. Refer to https://github.com/cytoscape/cytoscape.js-edgehandles
     * @param edgeHandling JsonObject as String
     * Example:
     * {
     * 	 preview:true,
     *   hoverDelay:150,
     *   handleNodes:"node",
     *   handlePosition: "middle top"
     * }
     * 
     */
    public void registerStandardEdgeHandling() {
    	
    	 ObjectMapper objectMapper = new ObjectMapper();	
      	 ObjectNode edgeHandlingBody=objectMapper.createObjectNode();
      	 edgeHandlingBody.put("preview", true);
      	 edgeHandlingBody.put("hoverDelay", 150);
      	 edgeHandlingBody.put("handleNodes", "node");
      	 edgeHandlingBody.put("handlePosition", "middle top");
      	    
      	  try {
      		String s=objectMapper.writeValueAsString(edgeHandlingBody);
      		getElement().callJsFunction("registerEdgeHandling",s);
      	  } catch (JsonProcessingException e1) {
      			e1.printStackTrace();
      	  } 
    	
    }
    
       /*
     * Centers the graph thus all elements are visible within the canvas. Calls SuccessListener.
     */
    public void centerGraph() {
    	getElement().callJsFunction("centerGraph");
    }
    
    /* Adds a node to the graph and calls the "nodeHasBeenAddedEvent". Returns null if the node is not a well-formated JsonObject-
     * @param node
     */
    
    public PendingJavaScriptResult addNode(Node node) {
    	try {
        	return getElement().callJsFunction("addNode",new ObjectMapper().writeValueAsString(node));
    	} catch (Exception ex) {
			ex.printStackTrace();
		}
    	return null;
    }
    
    /* Adds an edge to the graph and calls the "edgeHasBeenAddedEvent". Returns null if the edge is not a well-formated JsonObject-
     * @param node
     */
    
    public PendingJavaScriptResult addEdge(Edge edge) {
    	try {
        	return getElement().callJsFunction("addEdge",new ObjectMapper().writeValueAsString(edge));
    	} catch (Exception ex) {
			ex.printStackTrace();
		}
    	return null;
    }
    
    /* Delete the node identified by the ID. Calls SuccessListener.
     * @param id unique identifier of a node
     */
    public void deleteNode(String id) {
    	getElement().callJsFunction("deleteNode",id);
    }
    
    /* Delete the edge identified by the ID. Calls SuccessListener.
     * @param id unique identifier of an edge
     */
    public void deleteEdge(String id) {
    	getElement().callJsFunction("deleteEdge",id);
    }
    
    /* Register your own event based on: https://js.cytoscape.org/#cy.on
     * Calls customEvent
     * @param event event name  
     * @param selector selector name
     */
    public void registerEvent(String event,String selector) {
    	getElement().callJsFunction("registerEvent",event,selector);
    }
    
    
    /*
     * Convenience method for deleting all selected elements. Calls SuccessListener..
     */
    public void deleteSelectedElements() {
    	getElement().callJsFunction("deleteSelectedElements");
    }
    
    /*
     * Convenience method for clearing the graph. Calls SuccessListener..
     */
    public void deleteAll() {
    	getElement().callJsFunction("deleteAll");
    }
    
    /*
     * Set the data properties of a graph element. Adds or replaces the properties
     * Example: setElementData(id,"{\"myname\":\"martin\"}");
     * @param elementId
     * @param data String representation of a JsonObject
     */
    public void setElementData(String elementId, String data) {
    	getElement().callJsFunction("setData",elementId,data);
    }
    
    /*
     * Success event called after the following methods:
     *  deleteAll
		deleteNode
		deleteEdge
		deleteSelectedElements
		loadGraph
		loadStyles
		loadLayout
		centerGraph
     */
	public Registration addSuccessListener(
            ComponentEventListener<CytoscapeSuccessEvents> listener) {
        return addListener(CytoscapeSuccessEvents.class, listener);
	}
	
	/*
	 * Called after drag has happend
	 */
	
	public Registration addDragListener(
	        ComponentEventListener<CytoscapeDragEvents> listener) {
	    return addListener(CytoscapeDragEvents.class, listener);
	}
	
	/* 
	 * Called after a node has been added via addNode()
	 */
	public Registration addNodeHasBeenAddedEventListener(
	        ComponentEventListener<CytoscapeNodeHasBeenAddedEvent> listener) {
	    return addListener(CytoscapeNodeHasBeenAddedEvent.class, listener);
	}
	
	/* 
	 * Called after an edge has been added via addEdge()
	 */
	public Registration addEdgeHasBeenAddedEventListener(
	        ComponentEventListener<CytoscapeEdgeHasBeenAddedEvent> listener) {
	    return addListener(CytoscapeEdgeHasBeenAddedEvent.class, listener);
	}
	
	/*
	 * Called after the user has clicked the context menu of a node.
	 */
	public Registration addActionListener(
	        ComponentEventListener<CytoscapeActionEvents> listener) {
	    return addListener(CytoscapeActionEvents.class, listener);
	}
	
	/*
	 * Called after an edge has been added on the Canvas using the context menu (not via the addEdge Method)
	 */
	public Registration addEdgeAddedEventListener(
	        ComponentEventListener<CytoscapeEdgeAddedEvent> listener) {
	    return addListener(CytoscapeEdgeAddedEvent.class, listener);
	}
	
	/*
	 * Called after a custom event has been registered.
	 */
	public Registration addCustomEventListener(
	        ComponentEventListener<CytoscapeCustomEvents> listener) {
	    return addListener(CytoscapeCustomEvents.class, listener);
	}
    

    public static String getDemoGraph() {
    	JsonArray elements = Json.createArray();
        JsonObject node1 = Json.createObject();
        JsonObject data = Json.createObject();
        data.put("id", "a");  
        data.put("name", "Name A");    
        data.put("color", "#a00");
        node1.put("width", "10");
        node1.put("height", "10");
        
        node1.put("data", data);

        
        JsonObject position = Json.createObject();
        position.put("x", 0);
        position.put("y", 0);
        node1.put("position", position);
        
        elements.set(0, node1);
        
        return elements.toJson();
    }
    
    public static String getDemoGraph2() {
    	JsonObject elements= Json.createObject();
    	JsonArray elementsArray = Json.createArray();
        JsonObject node1 = Json.createObject();
        JsonObject data1 = Json.createObject();
        data1.put("id", "d");    
        data1.put("name", "Name D");      
        data1.put("type", "triangle");    
        
        JsonObject position1 = Json.createObject();
        position1.put("x", 0);
        position1.put("y", 0);
        node1.put("position", position1);

        node1.put("data", data1);
   
        JsonObject node2 = Json.createObject();
        JsonObject data2 = Json.createObject();
        data2.put("id", "b"); 
        data2.put("name", "Name B");   
        node2.put("data", data2);
        
        JsonObject position2 = Json.createObject();
        position2.put("x", 30);
        position2.put("y", 30);
        node2.put("position", position2);
        
        
        JsonObject edge = Json.createObject();
        JsonObject data3 = Json.createObject();
        data3.put("id", "db");    
        data3.put("source", "d");   
        data3.put("target", "b");   
        edge.put("data", data3);
              
        
        elementsArray.set(0, node1);
        elementsArray.set(1, node2);
        elementsArray.set(2, edge);
        
        elements.put("elements", elementsArray);
        
        return elements.toJson();
    }
   
}