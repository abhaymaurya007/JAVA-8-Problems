package Proble4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FoodOrderService f1=new FoodOrderService();
		FoodCustomer c1=new FoodCustomer(11,"pratyush","jaunpur","913546556");
		FoodCustomer c2=new FoodCustomer(12,"aashish","gaziabad","713546556");
		FoodCustomer c3=new FoodCustomer(13,"amiya","udisha","813546556");
	//f1.placeOrder(c1);		
	f1.printBill(c1);	
	f1.printBill(c1);	
		
		
		
		
		
		
		
		
		
		
		
	}

}
