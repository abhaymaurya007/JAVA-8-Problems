package Problem6;

import java.util.ArrayList;
import java.util.Collections;

public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Product> list=new ArrayList<Product>();
         Product p1=new Product(111,"laptop", 120000D);
         Product p2=new Product(112,"smartphone",1000D);
         Product p3=new Product(113,"watch", 100D);
         Product p4=new Product(114,"headphone", 15000D);
         list.add(p1);
         list.add(p2);
         list.add(p3);
         list.add(p4);
         System.out.println(list);
         Collections.sort(list);
         System.out.println(list);
         
		
		
		
	}

}
