package Problem17;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityqueDemo {
    public static void main(String[] args) {
        // Custom comparator to maintain insertion order
        Comparator<String> insertionOrderComparator = new Comparator<String>() {
            private final String[] order = {"Red", "Green", "Orange", "White", "Black"};
            
            @Override
            public int compare(String s1, String s2) {
                int index1 = getIndex(s1);
                int index2 = getIndex(s2);
                return Integer.compare(index1, index2);
            }
            
            private int getIndex(String s) {
                for (int i = 0; i < order.length; i++) {
                    if (order[i].equals(s)) {
                        return i;
                    }
                }
                return Integer.MAX_VALUE; // For any string not in our defined order
            }
        };
        
        // Initialize PriorityQueue with custom comparator
        PriorityQueue<String> colorQueue = new PriorityQueue<>(insertionOrderComparator);
        
        // Add the five colors in specified order
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Orange");
        colorQueue.add("White");
        colorQueue.add("Black");
        
        // Print all elements of the priority queue
        System.out.println("Elements in the PriorityQueue:");
        System.out.println(colorQueue);
        
        // Print elements one by one while removing them
        System.out.println("\nElements printed individually:");
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll());
        }
    }
}

