package Prob11.abhay.exception;

public class CommandLineDivision {
   public static void main(String[] args) {
	   try {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=a/b;
	System.out.println(c);
	   }
	   catch(NumberFormatException e) {
		   e.printStackTrace();
	   }
	   catch(IllegalArgumentException t) {
		   t.printStackTrace();
	   }
	   
	   System.out.println("program normally terminated");
}
}
