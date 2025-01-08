package Prob18.abhay.Exception;

public class ReservationSystem {
  public static void main(String[] args) throws InterruptedException {
	  CurrentBooking c1=new CurrentBooking(4);
	  CurrentBooking c2=new CurrentBooking(4);
	Thread t1=new Thread(c1,"aashish");
	t1.start();
	t1.join();
	Thread t2=new Thread(c2,"abhay");
	t2.start();
	t2.join();
}
}
