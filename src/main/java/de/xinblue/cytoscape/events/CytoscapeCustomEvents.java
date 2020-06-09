package de.xinblue.cytoscape.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

import de.xinblue.cytoscape.Cytoscape;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

@DomEvent("customEvent")
public class CytoscapeCustomEvents extends ComponentEvent<Cytoscape>{

	private String message;
	
	public CytoscapeCustomEvents(Cytoscape source, boolean fromClient, @EventData("event.detail") JsonObject detail) {
		super(source, fromClient);
		this.message=detail.toJson();
	}
	
	public String getMessage() {
		return this.message;
	}

}
