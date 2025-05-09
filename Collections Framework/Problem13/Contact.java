package Problem13;

import java.util.HashMap;
import java.util.Map;

public class Contact {
         Map<String, Integer> contactList=new HashMap<>();
         public void AddContact(String Add,Integer phno ) {
        	 contactList.put(Add, phno);
        	 System.out.println("Inserted succesfully");
         }
         public void removeContact(String l) {
        	 contactList.remove(l);
        	 System.out.println("removed succesfully.");
         }
         public void DisplayContact() {
        	 contactList.forEach((k,v)->System.out.println(k+" : "+v));
         }
         
         
         
}
