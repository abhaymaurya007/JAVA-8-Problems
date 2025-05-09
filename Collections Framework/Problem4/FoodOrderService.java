package Proble4;

import java.util.ArrayList;

public class FoodOrderService {
    ArrayList<FoodCustomer> flist=new ArrayList<FoodCustomer>();
    public void placeOrder(FoodCustomer h) {
    	flist.add(h);
    }
    
    
    
    public boolean isFirstTimeCustomer(FoodCustomer f) {
    	
    	for(FoodCustomer g:flist) {
    		
    		if(g.phoneNumber().equals(f.phoneNumber()))
    		{
    			return false;
    		}}
    		return true;

    	}
    
       public int calculateBill(FoodCustomer g) {
    	   if(isFirstTimeCustomer(g))
    	   {
    		  placeOrder(g);
    		   return 0;
    	   }
    	   else 
    		   return 80;
       } 
    
    public void printBill(FoodCustomer k) {
    	System.out.println("cname :"+k.customerName());
    	System.out.println("your bill is :"+calculateBill(k));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
