package Prob1.abhay.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
	System.out.print("Enter 1st integer no. :");
	int a=sc.nextInt();
	System.out.print("Enter 2nd integer no. :");
	int b=sc.nextInt();
	System.out.println("1st number  :"+a+"    2nd no.: "+b);
	
	sc.close();
	}
	catch(InputMismatchException e){
		System.out.println(e);
		System.out.println("enter  numbers only ");
	    e.printStackTrace();
		
	}
	System.out.println("Program Ended");
    
}
}
