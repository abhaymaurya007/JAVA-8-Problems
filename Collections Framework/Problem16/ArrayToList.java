package Problem16;

import java.util.*;

public class ArrayToList {
	 static  List<String> l=new ArrayList<>(); 
       public static void convertToList(String[] s) {
    	   for(String j:s) {
    		  try {
				l.add(j);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   }
       }
}
