package Problem13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c=new Contact();
		while(true) {
			c.DisplayContact();
			System.out.println("Choose operation to perform ");
			System.out.println("1. Add Contact");
			System.out.println("2. remove Contact");
			System.out.println("3.Exit");
			System.out.print("Enter you choice :");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:c.AddContact("jaunpur", 1234666555);
			c.AddContact("delhi", 45678654);	
			c.AddContact("gaziabad", 22346554);
			c.AddContact("hyderabad", 4666555);
				break;
			case 2:
				c.removeContact("gaziabad");
				break;
			case 3:System.out.println("bye thank you");
			return;
			default :System.out.println("invalid input.");
			}
		}
		

	}

}
