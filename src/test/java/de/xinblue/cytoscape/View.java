package de.xinblue.cytoscape;

import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import de.xinblue.cytoscape.model.Edge;
import de.xinblue.cytoscape.model.Node;
import de.xinblue.cytoscape.styles.GeneralGraphStyles;
import de.xinblue.cytoscape.styles.GraphStyles;


@Route("")
@CssImport(value = "./styles/cytoscape.css")
public class View extends Div {

    public View() {
	HorizontalLayout hl1=new HorizontalLayout();
    	
    	
        
        Cytoscape cy=new Cytoscape();
        cy.setWidth("100%");
        cy.setHeight("600px");   
        cy.addClassName("cy");
        cy.registerEvent("tap", "node");
        cy.registerEvent("mouseover", "node");

        cy.addActionListener(e -> {
        	System.out.println("ActionEvent");
        	System.out.println(e.getMessage());
        });
                
        cy.addCustomEventListener(e -> {
			try {
				JsonNode event = new ObjectMapper().readTree(e.getMessage());
				System.out.println(event.get("event").asText());
				System.out.println(event.get("selector").asText());
				JsonNode ja=event.get("data");
				Iterator<JsonNode> iterator = ja.iterator();
				while (iterator.hasNext()) {
					JsonNode js=iterator.next().at("/data/id");
					String id=js.asText();
					System.out.println(id);
				}
		
			} catch (Exception ex) {
				ex.printStackTrace();
			}
        });
        
        cy.addNodeHasBeenAddedEventListener(e -> {
        	System.out.println(e.getMessage());
        	
        });
        
        cy.addEdgeHasBeenAddedEventListener(e -> {
        	System.out.println(e.getMessage());
        	
        });
        
        cy.addEdgeAddedEventListener(e -> {
        	System.out.println(e.getMessage());
        	
        });
        
        GeneralGraphStyles node=new GeneralGraphStyles.Builder().background_color("#c00").label("data(id)").build();
        GeneralGraphStyles edge=new GeneralGraphStyles.Builder().width("2").line_color("#00c").line_style("dotted").build();
        GeneralGraphStyles node_selected=new GeneralGraphStyles.Builder().background_color("#0c0").build();
        GeneralGraphStyles eh_handle=new GeneralGraphStyles.Builder().background_color("#00C").width("8").height("8").text_opacity("0").build();
        GraphStyles gs=new GraphStyles();
        gs.addStyle("node", node);
        gs.addStyle("edge", edge);
        gs.addStyle("node:selected", node_selected);
        gs.addStyle(".eh-handle", eh_handle);
        cy.loadStyle(gs.getJson(true));
    
        VerticalLayout buttonLayout=new VerticalLayout();
        
        Button b1=new Button("Load Graph");
        b1.addClickListener( e -> {cy.loadGraph(cy.getDemoGraph2());});
        buttonLayout.add(b1);
        
        Button b2=new Button("Export Graph");
        b2.addClickListener( e -> {cy.exportGraph().then(e2 -> System.out.println(e2.toJson()));});
        buttonLayout.add(b2);
        
        Button b3=new Button("Center Graph");
        b3.addClickListener( e -> {cy.centerGraph();});
        buttonLayout.add(b3);
        
        Button b4=new Button("Get Selected Elements");
        b4.addClickListener( e -> {cy.getSelectedElements().then(e2 -> System.out.println(e2.toJson()));});
        buttonLayout.add(b4);
        
        Button b5=new Button("Add nodes and edges");
        b5.addClickListener( e -> {
        	
        	Node node1=new Node();
			node1.getPosition().put("x", 100);
			node1.getPosition().put("y", 100);	
			node1.getData().put("id", "x1");
			node1.getData().put("myname", "martin");

        	Node node2=new Node();
			node2.getPosition().put("x", 200);
			node2.getPosition().put("y", 200);	
			node2.getData().put("id", "x2");

			Edge edge1=new Edge();
			edge1.getData().put("id", "x1-x2");
			edge1.getData().put("source", "x1");
			edge1.getData().put("target", "x2");

			cy.addNode(node1).then(e1 -> cy.addNode(node2).then(e3 -> cy.addEdge(edge1)));
        });
        buttonLayout.add(b5);
        
        Button b6=new Button("Clear All");
        b6.addClickListener( e -> {cy.deleteAll();});
        buttonLayout.add(b6);
			
        
        Button b7=new Button("Delete selected");
        b7.addClickListener( e -> {
        	cy.getSelectedElements().then(e2 -> {
        		
        		String s=e2.toJson();
        		try {
					JsonNode selectedObject = new ObjectMapper().readTree(s);
					Iterator<JsonNode> iterator = selectedObject.iterator();
				
					System.out.println("delete selected");
					while (iterator.hasNext()) {
						JsonNode js=iterator.next().at("/data/id");
						String id=js.asText();
						System.out.println(id);
						cy.deleteNode(id);
					}
					
				
					
				} catch (Exception e1) {
					
				}
        		
        		
        		System.out.println(e2.toJson());
        	});
        });
        buttonLayout.add(b7);

        Button b8=new Button("Set Data");
        b8.addClickListener( e -> {cy.getSelectedElements().then(e2 -> {
	        	String s=e2.toJson();
	    		try {
					JsonNode selectedObject = new ObjectMapper().readTree(s);
					Iterator<JsonNode> iterator = selectedObject.iterator();
				
					System.out.println("delete selected");
					while (iterator.hasNext()) {
						JsonNode js=iterator.next().at("/data/id");
						String id=js.asText();
						System.out.println(id);
						cy.setElementData(id,"{\"myname\":\"martin\"}");
					}
					
				
					
				} catch (Exception e1) {
					
				}	
        	});
        });
        buttonLayout.add(b8);

        
        hl1.add(buttonLayout,cy);
        hl1.setWidth("100%");
        add(hl1);
        
        
    }
}
