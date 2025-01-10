package Prob1.abhay.MultiThreading;

import java.util.Arrays;

public class EducationInstitute {
   
	Course[] courses;
	 Offer[] offer;
	public EducationInstitute(Course[] courses, Offer[] offer) {
		super();
		this.courses = courses;
		this.offer = offer;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	public Offer[] getOffer() {
		return offer;
	}
	public void setOffer(Offer[] offer) {
		this.offer = offer;
	}
public void enrollStudentInCourse(int courseId, String studentName)
{
     for(Course c:courses)
     {
    	 if(c.getCourseId()==courseId)
    	 {
    		 System.out.println(studentName+" enrolled in Course :"+c.getCourseName());
    		 break;
    	 }
     }
}

}
