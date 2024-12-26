package Prob4.abhay.Exception;

import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void handleExceptions(String y) {
		try {
			System.out.println(y.length());
			int num=Integer.parseInt(y);
	
		}
		catch(NullPointerException e) {
			System.out.println("String is null");
			e.printStackTrace();
		}
		catch(NumberFormatException j){
			System.out.println("word can't be number ");
			System.out.println(j);
			j.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter String :");
		String s=sc.next();
		handleExceptions(s);
	}

}
