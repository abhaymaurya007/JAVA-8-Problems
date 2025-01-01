package Prob5.abhay.exception;

import java.util.Scanner;

public class DivisionExample {
    public static int  performDivision(int x,int y)throws ArithmeticException
    { 
		return x/y;
    }
    public static void main(String[] args)
    {  
    	Scanner sc=new Scanner(System.in);
        try(sc) {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
		System.out.println(performDivision(a, b));
        }
        catch(ArithmeticException j) {
        	System.out.println("U can't divide by zero");
        }
	}

}
