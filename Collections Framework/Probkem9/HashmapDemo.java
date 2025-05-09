package Probkem9;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> list=new HashMap<String, Integer>();
         list.put("apple", 50);
         list.put("Banana", 30);
         list.put("Orange", 20);
         System.out.println(list);
         System.out.println("list contains apple :"+list.containsKey("apple"));
         System.out.println("list contains Banana :"+list.containsKey("Banana"));
         System.out.println("list contains Mango :"+list.containsKey("Mango"));
         //asfdfkmjhgfdsfdghjkhgfdsas
         System.out.println("20 quantity is in list  :"+list.containsValue(20));
         System.out.println("20 quantity is in list  :"+list.containsValue(100));
	}

}
