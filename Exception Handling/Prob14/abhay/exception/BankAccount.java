package Prob14.abhay.exception;

public class BankAccount implements Bank {
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	@Override
	public void deposit(double amount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		if(amount<=0) {
			throw new InvalidAmountException("Invalid amount ");
		}
		else 
		{
			balance+=amount;
			System.out.println(amount+" :Rs deposited in your account");
			System.out.println("your current bal is :"+balance);
		}
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if(amount>balance) {
			throw new InsufficientFundsException("amount is more than balance");
		}
		else
		{
			balance-=amount;
			System.out.println(amount+" :Rs withdrwed from your account");
			System.out.println("your current bal is :"+balance);
		}
		
	}
	@Override
	public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException ,AccountNotFoundException{
		// TODO Auto-generated method stub
		
		if(this.balance<amount) {
			throw new InsufficientFundsException("amount is more than balance");
		}
		if(toAccount==null) {
			throw new AccountNotFoundException("Account not found");
		}
		if(amount<0)throw new InvalidAmountException("Amount should be postive");
		this.balance-=amount;
		System.out.println("Amount transfer successfully..");
	}
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException {
		// TODO Auto-generated method stub
		if(amount>50000) {
			throw new LoanNotAllowedException("amount is more than limit");
		}
		else {
			System.out.println("your loan application is granted");
		}
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	

}
