package prob2.abhay.UDFunction;

import java.util.function.UnaryOperator;
import java.util.Scanner;

public class ClassRoom {
    private int chairs;
    public ClassRoom(int chairs) {
        this.chairs = chairs;
    }

   
    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }
   //a b h a y
    @Override
    public String toString() {
        return "ClassRoom{chairs=" + chairs + "}";
    }

    public static UnaryOperator<ClassRoom> adjustChairs() {
        return classRoom -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of students:");
            int studentCount = sc.nextInt(); 
             sc.close();
            classRoom.setChairs(studentCount);
            return classRoom;
        };
    }
}

