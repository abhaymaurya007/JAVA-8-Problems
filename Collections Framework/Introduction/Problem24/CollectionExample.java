package Problem24;

import java.util.ArrayList;

public class CollectionExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(5);
		al.add("");
		al.add(10);
		System.out.println(al.contains(6));
		System.out.println(al.contains(10));
		System.out.println(al.contains(null));
		System.out.println(al);
	}
}