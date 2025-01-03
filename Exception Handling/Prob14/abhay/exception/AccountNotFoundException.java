package Prob14.abhay.exception;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception {

	public AccountNotFoundException() {
		super();
	}
	public AccountNotFoundException(String m) {
		super(m);
	}
}
