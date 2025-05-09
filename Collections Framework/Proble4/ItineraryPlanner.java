package Proble4;

import java.util.ArrayList;

public class ItineraryPlanner {
	 ArrayList<Destination> l1;
	 
	 public ItineraryPlanner() {
		super();
		this.l1 =new ArrayList<Destination>();
	}

	public void addDestination(Destination d) {
		 l1.add(d);
		
	 }
	public void getAllDestination() {
		
		 System.out.println(l1);
	 }

}
