package Problem4;

import java.util.*;
class VectorDemo 
{
public static void main(String args[]) 
{
Vector obj = new Vector(4,2);
obj.addElement(new Integer(3));
obj.addElement(new Integer(2));
obj.addElement(new Integer(5));
obj.removeAll(obj);
System.out.println(obj.isEmpty());
}
}