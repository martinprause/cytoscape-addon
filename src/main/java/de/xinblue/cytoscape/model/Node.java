package de.xinblue.cytoscape.model;

import java.util.HashMap;

public class Node {

	String group="nodes";
	HashMap<String,String> data=new HashMap<String,String>();
	HashMap<String,Integer> position= new HashMap<String,Integer>();
	
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
	public HashMap<String, Integer> getPosition() {
		return position;
	}
	public void setPosition(HashMap<String, Integer> position) {
		this.position = position;
	}
	
	
	
	

}
