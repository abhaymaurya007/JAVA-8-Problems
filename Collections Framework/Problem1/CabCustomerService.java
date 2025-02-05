package Problem1;

import java.util.ArrayList;

public class CabCustomerService {
	private ArrayList<CabCustomer> list=new ArrayList<CabCustomer>();
	
	
	public CabCustomerService() {
		super();
	}
	public void addCabCustomer(CabCustomer c1) {
		
		list.add(c1);
	}
	public boolean isFirstCustomer(CabCustomer c1) {
		for(CabCustomer c2 :list) {
			if(c2.getPhone().equals(c1.getPhone())) {
				return false;
			}
		}
		addCabCustomer(c1);
		return true;
	}
	public int calculateBill(CabCustomer c1) {
		if(isFirstCustomer(c1)) {
			return 0;
		}
		else {
		 if(c1.getDistance()<=4 ) {
			return 80;
		}
		else  {
			return (c1.getDistance()*6)+80;
		}
		}
	}
	public void printBill(CabCustomer c1) {
	int bill=calculateBill(c1);
	System.out.println("your total amount is :"+bill);
	}
	
	
	
	
	
	

}
