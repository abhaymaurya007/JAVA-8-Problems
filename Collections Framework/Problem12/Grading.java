package Problem12;

import java.util.HashMap;
import java.util.Map;

public class Grading {
	 
	HashMap<Student, String> list=new HashMap<>();
	public void addStudendtGrade(Student k,String grade) {
		list.put(k, grade);
		System.out.println("inserted succesfully.");
	}
	public void removeStudendtGrade(Student k) {
		list.remove(k);	
		System.out.println("removed succesfully.");
	}
	public void DisplayGradeList() {
		list.forEach((k,v)->System.out.println(k+" : "+v));
	}
	
	

}
