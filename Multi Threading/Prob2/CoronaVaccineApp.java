package Prob2.abhay.MultiThreading;

public class CoronaVaccineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t1 = new Thread(() -> {
		    User u1 = new User("Ramesh", 24, true);
		    u1.bookDose();
		});

		Thread t2 = new Thread(() -> {
		    User u2 = new User("Suresh", 16, false);
		    u2.bookDose();
		});

		
		t1.start();
		
		  t2.start();

	}

}
