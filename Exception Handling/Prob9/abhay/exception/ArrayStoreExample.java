package Prob9.abhay.exception;


public class ArrayStoreExample {
     public static void storeObjects() throws ArrayStoreException
     {
    	 Object ob[]= {"HELLO",123,"ABHAY","ravi","teja"};
    	for(Object o1:ob) {
    		if(!(o1 instanceof String)) {
    			throw new ArrayStoreException();
    		}
    		else {
    			System.out.println(o1);
    		}
    	}
    	 
    	 
    	 
     }
     public static void main(String[] args) {
    	 try {
		storeObjects();
    	 }
    	 catch(ArrayStoreException a) {
    		 a.printStackTrace();
    	 }
    	 
    	 
    	 System.out.println("program normally terminated");
	}
}
