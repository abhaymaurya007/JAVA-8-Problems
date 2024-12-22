package Prob3.abhay.supplier1;
import java.util.function.Supplier;
public class RandomValueGenerator {

	public static void main(String[] args) {
		
		Supplier<String> s1=()->{
			return "NIT"+(int)(Math.random()*10000);
		};
		 System.out.println(s1.get());
     Supplier<Integer> s2=()->{
			return (int)(Math.random() * (80-23+1)) + 23;
     };		
System.out.println(s2.get());
	}

}
