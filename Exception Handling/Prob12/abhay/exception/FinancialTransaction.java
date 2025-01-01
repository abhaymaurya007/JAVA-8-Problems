package Prob12.abhay.exception;

import java.util.Scanner;

public class FinancialTransaction {
	public static void processTransaction(String acNo,double amount)
	{
		if(amount<=0 ) {
			throw new IllegalArgumentException();
		}
		System.out.println("transaction succesfull");
	}
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		
		try(sc) {
			System.out.print("Enter a/c no :");
			String acNoString=sc.next();
			System.out.print("Enter amount :");
			Double amount=sc.nextDouble();
			 processTransaction(acNoString, amount);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
