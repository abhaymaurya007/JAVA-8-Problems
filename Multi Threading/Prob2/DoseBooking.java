package Prob2.abhay.MultiThreading;

public class DoseBooking {
   
	private  boolean booked=false;
	
	public synchronized void bookDose() {
	    if (!booked) {
	        booked = true;
	        System.out.println("Dose booked successfully.");
	    } else {
	        throw new RuntimeException("Dose already booked.");
	    }
	}

	public void isDoseBooked(){
		if(booked) {
			
			System.out.println("DoseBooking.bookDose() dose is available");
		}
		else
			System.out.println("DoseBooking.bookDose() not available");
	}
	
}
