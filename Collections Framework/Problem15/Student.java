package Problem15;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Student implements Serializable{
	  private Integer studentId;
	  private String studentName;
	  private double studentFees;
	  private String dateOfAdmission;
	public Student(Integer studentId, String studentName, double studentFees, String dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(double studentFees) {
		this.studentFees = studentFees;
	}
	public String getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(String dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
     public static  Student getStudentObject() {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter student id:");
    	 int id=sc.nextInt();
    	 System.out.print("Enter student Name:");
    	 String name=sc.next();
    	 System.out.print("Enter student fees:");
    	 Double fee=sc.nextDouble();
    	 System.out.print("Enter student Admission date:");
    	 String date=sc.next();
    	 return new Student(id, name, fee, date);
    	 
     }
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
     
}
