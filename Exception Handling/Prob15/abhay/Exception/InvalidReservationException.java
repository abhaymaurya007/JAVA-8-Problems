package Prob15.abhay.Exception;

@SuppressWarnings("serial")
public class InvalidReservationException extends RuntimeException {

	public InvalidReservationException() {
		super();
	}
	public InvalidReservationException(String m) {
		super(m);
	}
   
}
