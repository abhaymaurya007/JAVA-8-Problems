package Prob1.abhay.MultiThreading;

import java.util.Arrays;

public class Student {
      private String name;
      EducationInstitute institute;
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
		
	}
public void viewCoursesAndFees() {
for(Course c:institute.getCourses())
{
	System.out.println(c.getCourseId()+" : "+c.getCourseName()+" : "+c.getCorseFee());
}
}
public void viewOffers()
{
	for(Offer f:institute.getOffer())
	{
		System.out.println(f.getOfferText());
	}
}
      public void enrollInCourse(int courseId)
      {
    	  institute.enrollStudentInCourse(courseId, name);
      }
         
}
