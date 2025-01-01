package Prob8.abhay.exception;

import java.util.Scanner;

public class ClassNotFoundExpDemo {

	public ClassNotFoundExpDemo( String name)  {
		
		super();
		
	     try {
	                 Class<?> forName = Class.forName(name);
	                 System.out.println(forName);
	   
			
	     }
	     catch(ClassNotFoundException e){
	    	 System.out.println("class not found");
	    	 e.printStackTrace();
	    	 
	     }
			 
		
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		//java.lang.String
		String cls=sc.next();
		new ClassNotFoundExpDemo(cls);
		sc.close();
		
	}

}
 