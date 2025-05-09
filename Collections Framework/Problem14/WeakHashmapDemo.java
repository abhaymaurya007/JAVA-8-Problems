package Problem14;

import java.util.WeakHashMap;

public class WeakHashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeakHashMap<Integer, String> l=new WeakHashMap<Integer, String>();
		Integer n1= new Integer(12);
		Integer n2=13;
		Integer n3=14;
		l.put(n1, "akshay");
		n1=null;
		l.forEach((k,v)->System.out.println(k+"  :   "+v));
		System.gc();
		try {
			Thread.sleep(3000);
			System.out.println(n1);
			l.forEach((k,v)->System.out.println(k+"  :   "+v));
			System.out.println(l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
