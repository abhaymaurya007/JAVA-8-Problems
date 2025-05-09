package Problem2;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

public class Main3 {
 public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(35);
	a1.add(45);
	a1.add(55);
	a1.add(65);
	a1.add(35);
	a1.add(35);
	List<Integer> l1=a1;
	l1.remove(1);
	System.out.println(l1);
	System.out.println(a1);
	Collection<Integer> c1=a1;
	c1.remove(35);
	System.out.println(a1);
	 
	 
	 
	 
}
}
