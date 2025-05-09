package Problem2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(44);
		list.add(54);
		list.add(64);
		list.add(74);
		list.add(84);
		
		ListIterator<Integer> i = list.listIterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		while(i.hasPrevious())
		{
			System.out.print(i.previous()+" ");
		}

	}

}
