package Prob10.abhay.exception;

public class ParentClass {

	public ParentClass( ) {
		super();
	}
	public void loadingClass(String name) throws ClassNotFoundException {
	  Class.forName(name);
	}
        
	
	
	
}
