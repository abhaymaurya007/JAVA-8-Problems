package Prob4.abhay.function1;

import java.util.function.Function;

public class FunctionApplier {
	public static void main(String[] args) {
		
	
   Function<String, Integer > s1=(l)->{
	   return l.length();
   };
   System.out.println("abhi length is :"+s1.apply("abhi"));
   Function <Integer, Double> f2=(l1)->{
	   return l1/2.0;
   };
   System.out.println(f2.apply(10));
}
}