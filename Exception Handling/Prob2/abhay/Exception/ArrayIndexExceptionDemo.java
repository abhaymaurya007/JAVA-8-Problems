package Prob2.abhay.Exception;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		
        int a[]=new int[3];
       a[1]=6;
        a[2]=5;
        try {
        	System.out.println(a[3]);
        }
        catch(ArrayIndexOutOfBoundsException a1)
      {       System.err.println("There is no value in this index");
        	System.out.println(a1);
        	a1.printStackTrace();
        }
	}

}
