package Problem21;

import java.util.ArrayList;

public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=5;i<10;i++) 
		{
			al.add(i);
		}
		al.remove(4);
		for(int str: al)
			System.out.print(str+" ");
	}
}