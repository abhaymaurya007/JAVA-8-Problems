package Problem15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		 Scanner sc=new Scanner(System.in);
       while(true) {
    	   System.out.println(list);
    	   System.out.println("1. Create student object");
    	   System.out.println("2. Exit");
    	   System.out.print("Enter your choice here :");
    	  
    	   int choice=sc.nextInt();
    	   switch(choice) {
    	   case 1:System.out.println("Enter how many stu obj u want to store:");
    	    int c=sc.nextInt();
    	    for(int i=0;i<c;i++) {
    		   list.add(Student.getStudentObject());
    	    }
    	    String loc="D:\\ARRAY\\student2.txt";
			try {
				var foi= new FileOutputStream(loc);
			var oi=	new ObjectOutputStream(foi);
			
				oi.writeObject(list);
				System.out.println("inserted succesfully");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   	
    	   break;
    	   case 2:
    		   System.out.println("thank you bye");
    		   return;
    		   default:System.out.println("Invalid input.");
    	   }
    	   
       }
      	
		
		
		
		
		
	
	}

}
