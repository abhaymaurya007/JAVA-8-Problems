package Prob1.abhay.MultiThreading;

public class Main {
  public static void main(String[] args) throws InterruptedException {
	
	  Course c[]= {new Course(101, "java", 3000),new Course(102, "Python", 4000),new Course(103, "C++", 5000)};
	  Offer f[]= {new Offer("Special discount: Get 20% off on all courses!"),new Offer("Limited time offer: Enroll in any two courses and get one course free!\r\n"
	  		+ "")};
	  
	  EducationInstitute e=new EducationInstitute(c, f);
	  Student s1=new Student("Virat", e);
	  Student s2=new Student("Dhoni", e);
	  
	  
	  Thread t=new Thread(){
		  public void run()
		  {
			  s1.viewCoursesAndFees();
			  s1.viewOffers();
			  s1.enrollInCourse(102);
		  }
	  };
	  Thread t2=new Thread(){
		  public void run()
		  {
			  s2.viewCoursesAndFees();
			  s2.viewOffers();
			  s2.enrollInCourse(101);
		  }
	  };
	  
	  t.start();
	  t.join();
	  t2.start();
	  
}
}
