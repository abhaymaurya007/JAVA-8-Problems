package Prob15.abhay.Exception;

public class ReservationSystem {
	private int seats;

	public ReservationSystem(int seats) {
		super();
		this.seats = seats;
	}
	public void reserveSeat(int numberOfSeats) //throws SeatUnavailableException
	{
		try
		{
		if(numberOfSeats>seats) {
			throw new SeatUnavailableException("Seat Unavailable");
		}
		else {
			seats-=numberOfSeats;
			System.out.println("Seat Succcesfuly reserved");
		}
		}
		catch(SeatUnavailableException e)
		{
			System.out.println(e.getMessage());
		}
	}
public void reserveSeatUnchecked(int numberOfSeats)
{
	
	
	try
	{
	if(numberOfSeats>seats) {
		throw new InvalidReservationException("ivalid reservation");
	}
	else {
		seats-=numberOfSeats;
		System.out.println("Seat Succcesfuly reserved");
	}
	}
	catch(InvalidReservationException j)
	{
		System.out.println(j.getMessage());
	}
}
	
	
}
