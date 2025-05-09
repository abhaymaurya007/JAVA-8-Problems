package Problem10;
import java.util.ArrayList;

public class HashmapDemo{
    public static void main(String []args){
        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(111,"ganesh"));
        list.add(new Employee(222,"rohit"));
        list.add(new Employee(333,"aashish"));

    
    }
} 
record Employee(Integer id,String name){}