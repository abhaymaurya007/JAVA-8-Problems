package Problem25;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(50);
		al.add(25);
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		li.add(22);
		System.out.println(li.hasNext());
	}
}