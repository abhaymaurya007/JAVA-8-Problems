package Prob18.abhay.Exception;

public class CurrentBooking  implements Runnable{
	int SeatAvailable=4,BookSeat;
	

	public CurrentBooking( int bookSeat) {
		super();
		
		BookSeat = bookSeat;
		
		
	}


	@Override
	public void run() {
		if(SeatAvailable>=BookSeat) {
			String n=Thread.currentThread().getName();
			
			SeatAvailable-=BookSeat;
			System.out.println("hi "+n);
			System.out.println(BookSeat +" seat Confirmed");
			
			}
		else
			{System.out.println("insuffucient seat");
		  System.out.println("u can book only "+SeatAvailable+"seats");
			}
		
	}

}
