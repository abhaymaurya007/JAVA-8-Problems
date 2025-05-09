package Proble4;

public class TravelItineraryPlanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ItineraryPlanner l=new ItineraryPlanner();
       Destination paris = new Destination("Paris");
       Destination london = new Destination("London");
       london.addActivity(new Activity("British Museum", "Morning"));
       london.addActivity(new Activity("London Eye", "Afternoon"));
       l.addDestination(paris);
       l.addDestination(london);
       l.getAllDestination();
		
		
		
		
		
		
		
	}

}
