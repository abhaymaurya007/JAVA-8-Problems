/**
 * is name is starting with A or not using java 8
 */
import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo3 {
	public static void main(String[] args) 
	{
		// Verify whether my name starts with character A or not

		Function<String, Boolean> fn3 = str -> str.startsWith("A");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.next();
		
		System.out.println("Name starts with A "+fn3.apply(name));
        sc.close();
	}

}