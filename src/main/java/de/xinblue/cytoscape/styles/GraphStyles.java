package de.xinblue.cytoscape.styles;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class GraphStyles {

		HashMap <String,GeneralGraphStyles> selectorStyles;
				
		public GraphStyles() {
			selectorStyles = new HashMap<String,GeneralGraphStyles>();
		}
		
		public String getJson(boolean withName) {
		       ObjectMapper objectMapper = new ObjectMapper();		
		       try {
		    	   ArrayNode styleArray = objectMapper.createArrayNode();
		    	   
		    	   for (String selector:selectorStyles.keySet()) {
		    		   GeneralGraphStyles gs=selectorStyles.get(selector);
		    		   ObjectNode styleBody=objectMapper.createObjectNode();
		    		   styleBody.put("selector", selector);
		    		   styleBody.putPOJO("style", gs);
		        	   styleArray.add(styleBody);
		    	   }
		    	   if (styleArray.size()>0) {
			    	   if (withName) {
					       ObjectNode styleModel = objectMapper.createObjectNode();
					       styleModel.set("style", styleArray);
					       return objectMapper.writeValueAsString(styleModel);
				       } else {
				    	   return objectMapper.writeValueAsString(styleArray); 
				       }
		    	   } else {
		    		   return ""; 
		    	   }
					
				} catch (JsonProcessingException e1) {
					e1.printStackTrace();
				}
		       return "";
		}

		public void addStyle(String selector, GeneralGraphStyles styles) {
			selectorStyles.put(selector, styles);
		}
		public GeneralGraphStyles getStyle(String selector) {
			return selectorStyles.get(selector);
		}
		public void removeStyle(String selector) {
			selectorStyles.remove(selector);
		}
		
		
}
