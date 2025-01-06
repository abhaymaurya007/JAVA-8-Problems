package Prob16.abhayException;

@SuppressWarnings("serial")
public class OutOfStockException extends RuntimeException {

	public OutOfStockException() {
		super();
	}
	public OutOfStockException(String m) {
		super(m);
	}
}
