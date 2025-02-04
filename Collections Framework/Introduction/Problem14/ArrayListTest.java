package Problem14;

import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
 ArrayList<Character> list = new ArrayList<>();
 list.add('a');
 list.add('b');
 list.add('c');
 list.add('d');
 list.remove(Character.valueOf('c'));
 System.out.println(list);
 }
}