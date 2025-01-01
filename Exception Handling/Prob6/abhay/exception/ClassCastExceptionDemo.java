package Prob6.abhay.exception;



public class ClassCastExceptionDemo {
	 public static void handleClassCastException() 
	 {  
		 Object ob[]= {"HELLO",123,"ABHAY"};
		try
		{
			for (Object o1: ob) {
				String a=(String) o1;
				System.out.println("Casting successful :"+a);
			}
		}
		catch (ClassCastException e) {	
		e.printStackTrace();	
		}	 
	 }
	 public static void main(String[] args) {
		 handleClassCastException();
		 System.out.println("program normally compeleted ");
		 
	}
	 

}
