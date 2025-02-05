package Problem1;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CabCustomerService s1=new CabCustomerService();
		CabCustomer c1=new CabCustomer(1,"raj","ameepet","Secunderabad", 5,"9366446446");
		CabCustomer c2=new CabCustomer(2,"pratyush","ameepet","kazipet", 4,"9434435546");
		CabCustomer c3=new CabCustomer(1,"raj","kazipet","pune", 150,"9356556446");
		s1.printBill(c1);
		s1.printBill(c1);
		s1.printBill(c2);
		s1.printBill(c2);
		s1.printBill(c3);
		s1.printBill(c3);
		

	}

}
