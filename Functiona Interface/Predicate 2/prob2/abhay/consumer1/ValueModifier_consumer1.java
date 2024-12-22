package prob2.abhay.consumer1;
import java.util.Scanner;
import java.util.function.Consumer;
public class ValueModifier_consumer1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. for get Square :");
		int var=sc.nextInt();
		Consumer<Integer> c1=(var1)->{
			System.out.println("Square is :"+var1*var1);
		};
	c1.accept(var);
	
	Consumer<String> c2=(str1)->{
		System.out.println(str1.toUpperCase());
	};
	System.out.print("Enter String to change into upper case :");
	String str2=sc.next();
	c2.accept(str2);
	sc.close();
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
