package prob1.abhay.UDFunctions;

import java.util.function.Consumer;

public class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void updateName(Consumer<Student> nameUpdater) {
        nameUpdater.accept(this);
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

  
