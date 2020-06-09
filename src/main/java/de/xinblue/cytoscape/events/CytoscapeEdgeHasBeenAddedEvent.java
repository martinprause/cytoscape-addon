package de.xinblue.cytoscape.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

import de.xinblue.cytoscape.Cytoscape;
import elemental.json.JsonObject;

@DomEvent("edgeHasBeenAddedEvent")
public class CytoscapeEdgeHasBeenAddedEvent extends ComponentEvent<Cytoscape>{

	private String message;
	
	public CytoscapeEdgeHasBeenAddedEvent(Cytoscape source, boolean fromClient, @EventData("event.detail") JsonObject detail) {
		super(source, fromClient);
		this.message=detail.toJson();
	}
	
	public String getMessage() {
		return this.message;
	}

}
