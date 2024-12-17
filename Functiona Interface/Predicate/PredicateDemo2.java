/**
 * Check given string is starting with A or not using java 8 feature
 */
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo2 
{
	public static void main(String[] args)
	{
	   //Given name starts with character 'A' or not 
		
	   Predicate<String> p2 = str -> str.startsWith("A");
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter your Name :");
	   String name = sc.next();
	   
	   System.out.println(name+" starts with A or not ?"+p2.test(name));
	   sc.close();	

	}

}