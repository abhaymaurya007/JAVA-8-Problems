package Problem7;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
	Customer c1=new Customer(11, "aashish",1200D);
	Customer c2=new Customer(10, "pratyush",1100D);
	Customer c3=new Customer(13, "sakshi",1300D);
	ArrayList<Customer> list=new ArrayList<Customer>();
	list.add(c1);
	list.add(c2);
	list.add(c3);
	System.out.println(list);
	System.out.println("===============================================================");
	//sorting by number
	Collections.sort(list, (p1,p2)->
	p1.customerNumber().compareTo(p2.customerNumber()));
	System.out.println(list);
	System.out.println("===============================================================");
	Collections.sort(list, (p1,p2)->
	p1.customerName().compareTo(p2.customerName())
	);
	System.out.println(list);
	System.out.println("===============================================================");
	Collections.sort(list, (p1,p2)->
	p1.customerBill().compareTo(p2.customerBill())
	);
	System.out.println(list);
	}
}
