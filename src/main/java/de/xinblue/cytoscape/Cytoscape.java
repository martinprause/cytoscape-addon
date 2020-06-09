package de.xinblue.cytoscape;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

	public Registration addSuccessListener(
	            ComponentEventListener<CytoscapeSuccessEvents> listener) {
	        return addListener(CytoscapeSuccessEvents.class, listener);
	}
	
	public Registration addDragListener(
            ComponentEventListener<CytoscapeDragEvents> listener) {
        return addListener(CytoscapeDragEvents.class, listener);
	}
	
	public Registration addNodeHasBeenAddedEventListener(
            ComponentEventListener<CytoscapeNodeHasBeenAddedEvent> listener) {
        return addListener(CytoscapeNodeHasBeenAddedEvent.class, listener);
	}
	
	public Registration addEdgeHasBeenAddedEventListener(
            ComponentEventListener<CytoscapeEdgeHasBeenAddedEvent> listener) {
        return addListener(CytoscapeEdgeHasBeenAddedEvent.class, listener);
	}
	
	public Registration addActionListener(
            ComponentEventListener<CytoscapeActionEvents> listener) {
        return addListener(CytoscapeActionEvents.class, listener);
	}
	
	public Registration addEdgeAddedEventListener(
            ComponentEventListener<CytoscapeEdgeAddedEvent> listener) {
        return addListener(CytoscapeEdgeAddedEvent.class, listener);
	}
	
	public Registration addCustomEventListener(
            ComponentEventListener<CytoscapeCustomEvents> listener) {
        return addListener(CytoscapeCustomEvents.class, listener);
	}
	
	
	public Cytoscape() {
		this.setId("cy");
	}
 

   
    public void setDragObject(String dragObject) {
    	getElement().setProperty("dragObject", dragObject); 
    }
    
    public void loadGraph(String elements) {
    	getElement().callJsFunction("loadGraph",elements);
    }
    
    
    public PendingJavaScriptResult exportGraph() {
    	return getElement().callJsFunction("exportGraph");
    }
    
    public PendingJavaScriptResult getSelectedElements() {
    	return getElement().callJsFunction("selectedElements",":selected");
    }
    

    public void loadStyle(String styles) {
    	getElement().callJsFunction("loadStyles",styles);
    }
    
    public void centerGraph() {
    	getElement().callJsFunction("centerGraph");
    }
    public PendingJavaScriptResult addNode(Node node) {
    	try {
        	return getElement().callJsFunction("addNode",new ObjectMapper().writeValueAsString(node));
    	} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
    	return null;
    }
    
    public PendingJavaScriptResult addEdge(Edge edge) {
    	try {
        	return getElement().callJsFunction("addEdge",new ObjectMapper().writeValueAsString(edge));
    	} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
    	return null;
    }
    
    
    public void deleteNode(String id) {
    	getElement().callJsFunction("deleteNode",id);
    }
    
    public void registerEvent(String event,String node) {
    	getElement().callJsFunction("registerEvent",event,node);
    }
    
    public void deleteEdge(String id) {
    	getElement().callJsFunction("deleteEdge",id);
    }

    public void deleteSelectedElements() {
    	getElement().callJsFunction("deleteSelectedElements");
    }
    public void deleteAll() {
    	getElement().callJsFunction("deleteAll");
    }
    public void setElementData(String id, String data) {
    	getElement().callJsFunction("setData",id,data);
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

        node1.put("data", data1);
   
        JsonObject node2 = Json.createObject();
        JsonObject data2 = Json.createObject();
        data2.put("id", "b"); 
        data2.put("name", "Name B");   
        node2.put("data", data2);
        
        
        JsonObject node3 = Json.createObject();
        JsonObject data3 = Json.createObject();
        data3.put("id", "db");    
        data3.put("source", "d");   
        data3.put("target", "b");   
        node3.put("data", data3);
              
        
        elementsArray.set(0, node1);
        elementsArray.set(1, node2);
        elementsArray.set(2, node3);
        
        elements.put("elements", elementsArray);
        
        return elements.toJson();
    }
   
}