package Prob10.abhay.exception;

public class ChildClass extends ParentClass {
     
	
	public ChildClass( ) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadingClass(String name) throws ClassNotFoundException {
           super.loadingClass(name);
		}
}
