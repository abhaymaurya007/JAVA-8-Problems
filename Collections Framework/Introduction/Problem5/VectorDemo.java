package Problem5;

import java.util.*;
class VectorDemo 
{
public static void main(String args[]) 
{
int array[] = new int [5];
for (int i = 5; i > 0; i--)
{
array[5-i] = i;
}
Arrays.fill(array, 1, 4, 8);// 5 8 8 8 1
for (int i = 0; i < 5 ; i++)
System.out.print(array[i]+" ");

}
}