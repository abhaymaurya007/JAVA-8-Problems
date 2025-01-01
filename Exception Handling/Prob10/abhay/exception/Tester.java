package Prob10.abhay.exception;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass p1=new ChildClass();
		try {
		p1.loadingClass("java.lang.String");
		System.out.println("Class Succesfully loaded ");
		}
		catch(Exception e){
			System.out.println("class in not available ");
			e.printStackTrace();
		}
		

	}

}
