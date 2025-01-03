package Prob14.abhay.exception;

@SuppressWarnings("serial")
public class LoanNotAllowedException extends RuntimeException {

	public LoanNotAllowedException() {
		super();
	}

	public LoanNotAllowedException(String m) {
		super(m);
	}

}
