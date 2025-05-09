package Problem5;

import java.util.ArrayList;

import Proble4.FoodCustomer;

public class AirlineBookingService {
         ArrayList<AirlineCustomer> list= new ArrayList<>();
	public void bookFlight(AirlineCustomer a) 
	{
		list.add(a);
	}
public boolean isFirstTimeCustomer(AirlineCustomer f) {
    	
    	for(AirlineCustomer g:list) {
    		
    		if(g.phoneNumber().equals(f.phoneNumber()))
    		{
    			return false;
    		}}
    		return true;

    	}
public int calculateBill(AirlineCustomer g) {
	   if(isFirstTimeCustomer(g))
	   {
		  bookFlight(g);
		   return 0;
	   }
	   else 
		   return 8000;
} 

public void printBill(AirlineCustomer k) {
	System.out.println("cname :"+k.fullName());
	System.out.println("your bill is :"+calculateBill(k));
}

	
	
}
