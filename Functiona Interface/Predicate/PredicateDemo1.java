/**
 * Check Number is even or odd using java 8 features
 */
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo1 
{
	public static void main(String[] args) 
	{
		//WAP to verify whether a number is even or odd
		
		Predicate<Integer> p1 = num -> num%2==0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();

		System.out.println("Is "+num+" even number ?"+p1.test(num));
		sc.close();
	}

}