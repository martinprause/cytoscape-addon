package de.xinblue.cytoscape.model;

import java.util.HashMap;

public class Edge {

	String group="edges";
	HashMap<String,String> data=new HashMap<String,String>();
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public HashMap<String, String> getData() {
		return data;
	}
	public void setData(HashMap<String, String> data) {
		this.data = data;
	}

}
