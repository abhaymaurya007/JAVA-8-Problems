package Problem8;

import java.util.Collections;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            TreeSet<Product> plist=new TreeSet<Product>((p1,p2)->p1.pid().compareTo(p2.pid()));
            plist.add(new Product(111, "laptop"));
            plist.add(new Product(333, "phone"));
            plist.add(new Product(222, "watch"));
            plist.add(new Product(444, "headphone"));
            System.out.println("ascending order of id :");
            for(Product p:plist) {
            	System.out.println(p);
            }
            TreeSet<Product> plist2=new TreeSet<Product>((p1,p2)->p2.pid().compareTo(p1.pid()));
            plist2.addAll(plist);
            System.out.println("descending order of id :");
            for(Product p:plist2) {
            	System.out.println(p);
            }
            
            TreeSet<Product> list=new TreeSet<Product>((p1,p2)->p1.pname().compareTo(p2.pname()));
            list.addAll(plist);
            System.out.println("ascending order of name :");
            for(Product p:list) {
            	System.out.println(p);
            }
            TreeSet<Product> list2=new TreeSet<Product>((p1,p2)->p2.pname().compareTo(p1.pname()));
            list2.addAll(plist);
            System.out.println("descending order of name :");
            for(Product p:list2) {
            	System.out.println(p);
            }
            
            
           
	}

}
