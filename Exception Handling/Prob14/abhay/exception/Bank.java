package Prob14.abhay.exception;

public interface Bank {
	
	
   public void deposit(double amount) throws InvalidAmountException;
   public void withdraw(double amount) throws InsufficientFundsException;
   public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException,AccountNotFoundException;
   public void applyForLoan(double amount) throws LoanNotAllowedException;
   public double getBalance();
   
   
   
   
   
   
   
   
   
}
