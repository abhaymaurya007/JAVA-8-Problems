package prob2.abhay.UDFunction;

public class Tester {
    public static void main(String[] args) {
      
        ClassRoom classRoom = new ClassRoom(100);
        System.out.println(classRoom);
        classRoom = ClassRoom.adjustChairs().apply(classRoom);
        System.out.println("Adjusted ClassRoom Details:");
        System.out.println(classRoom);
    }
}
