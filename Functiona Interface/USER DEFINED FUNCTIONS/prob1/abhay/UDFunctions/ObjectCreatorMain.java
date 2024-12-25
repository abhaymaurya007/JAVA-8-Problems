package prob1.abhay.UDFunctions;

import java.util.Scanner;
import java.util.function.Consumer;


public class ObjectCreatorMain {
    public static void main(String[] args) {
       
        ObjectCreator creator = (id, name) -> new Student(id, name);
        Student student = (Student) creator.create(1, "John Doe");
        System.out.println(student);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name for change :");
        String modified_name=sc.next();
        Consumer<Student> nameUpdater = (stud) -> stud.setName(modified_name);
        student.updateName(nameUpdater);
        System.out.println("Updated Student Details:");
        System.out.println(student);
        sc.close();
    }
}
