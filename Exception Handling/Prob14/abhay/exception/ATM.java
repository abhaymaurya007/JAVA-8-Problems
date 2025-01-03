package Prob14.abhay.exception;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select an option :");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Transfer");
		System.out.println("4. Loan Application");
		System.out.println("5. Check Balance");
		System.out.println("6. Exit");
		BankAccount ba1 = new BankAccount(544646576, 20000);
		BankAccount ba2 = new BankAccount(12345678, 10000);
		// Customer c1=new Customer("Abhay", ba1);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter your choice :");
			int ch = sc.nextInt();
			try {
				switch (ch) {
					case 1:
						System.out.print("Enter amount :");
						double d = sc.nextDouble();
						ba1.deposit(d);
						break;
					case 2:
						System.out.print("Enter amount :");
						double e = sc.nextDouble();
						ba1.withdraw(e);
						break;
					case 3:
						System.out.print("Enter amount :");
						double f = sc.nextDouble();
						ba1.transfer(ba2, f);
						break;
					case 4:
						System.out.print("enter amount for loan :");
						double g = sc.nextDouble();
						ba1.applyForLoan(g);
						break;
					case 5:
						System.out.println(ba1.getBalance());
						break;
					case 6:
						System.out.print("thank you for ur services");
						sc.close();
						return;
				}
			} catch (InsufficientFundsException a) {
				a.printStackTrace();
			} catch (InvalidAmountException b) {
				b.printStackTrace();
			} catch (LoanNotAllowedException c) {
				c.printStackTrace();
			} catch (AccountNotFoundException d) {
				d.printStackTrace();
			}

		}

	}

}
