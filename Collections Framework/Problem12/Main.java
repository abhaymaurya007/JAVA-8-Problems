package Problem12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grading g=new Grading();
		Student s1=new Student(111,"aasmit");
		Student s2=new Student(112,"abhay");
		Student s3=new Student(113,"aashish");
		Student s4=new Student(114,"pratyush");
		while(true) {
			g.DisplayGradeList();
			System.out.println("Choose Operation :");
			System.out.println("1. Add grade of student");
			System.out.println("2. remove student grade");
			System.out.println("3. Exit");
			System.out.print("Enter your choice :");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				g.addStudendtGrade(s1, "A+");
				g.addStudendtGrade(s2, "b+");
				g.addStudendtGrade(s3, "c+");
				g.addStudendtGrade(s4, "d+");
				break;
			case 2:
				g.removeStudendtGrade(s3);
				g.removeStudendtGrade(s1);
				break;
			case 3:
				System.out.println("Bye ! thank you");
				return;
			default :System.out.println("Invalid input.");
			}
		}

	}

}
