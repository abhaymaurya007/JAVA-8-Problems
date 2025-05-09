package Prob2.abhay.MultiThreading;

public class User {
	
	
	private String name;
	private int age;
	private boolean hasHealthCondition;
	private VaccineEligibility ve;
	private DoseBooking db;
	public User(String name, int age, boolean hasHealthCondition) {
		super();
		this.name = name;
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
		ve=new VaccineEligibility(age, hasHealthCondition);
		db=new DoseBooking();
	}
	
	public boolean isEligible() {
		
		if(ve.isEligible()) {
			System.out.println("user is eligible");
			return true;
		}
		else
	System.out.println("user is not eligible");
		return false;
			
	}
	public void bookDose() {
	    System.out.println("for   :" + name);
	    if (isEligible()) {
	        try {
	            db.bookDose();
	        } catch (RuntimeException e) {
	            System.out.println(e.getMessage());
	        }
	    } else {
	        System.out.println(name + " is not eligible for the vaccine.");
	    }
	}

	public void isDoseBooked() {
		db.isDoseBooked();
	}

}
