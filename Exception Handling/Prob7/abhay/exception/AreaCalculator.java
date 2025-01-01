package Prob7.abhay.exception;

import java.util.Scanner;

public class AreaCalculator {
     public static double calculateArea(double Length,double Width) throws IllegalArgumentException
     {   if(Length<0 || Width<0) {
    	 throw new IllegalArgumentException();
     }
    	 return Length*Width;
     }
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
		try (sc){
			System.out.print("Enter Length :");
			double len=sc.nextDouble();
			System.out.print("Enter width :");
			double width=sc.nextDouble();
			System.out.println(calculateArea(len, width));
		}
		catch(IllegalArgumentException e) {
			System.out.println("u can't enter negative values");
			e.printStackTrace();
		}
		System.out.println("program normally terminated");
		
	}
}
