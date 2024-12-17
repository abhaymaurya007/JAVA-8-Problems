//find the length of given city using java 8
import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) 
	{
		//Finding the length of given city
		
		Function<String,Integer> fn2 = str -> str.length();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your City Name :");
		String city = sc.next();
		
		System.out.println("Langth of "+city+" is :"+fn2.apply(city));
		sc.close();
		   
	}

}