package Proble4;

import java.util.ArrayList;

public class Destination {
	   private String name;
	  ArrayList<Activity> list;
	  
	  
	public Destination(String name) {
		super();
		this.name = name;
		this.list = new ArrayList<Activity>();
	}
	public void addActivity(Activity v) {
		  list.add(v);
		 
	  }
	public void getAllActivity() {
		 
		  System.out.println(list);
	  }
	@Override
	public String toString() {
		return "Destination [name=" + name + ", list=" + list + "]";
	}
	
	  

}
