package Problem2;

import java.util.ArrayList;
import java.util.Collection;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> FruitList=new ArrayList<>();
		FruitList.add("banana");
		FruitList.add("apple");
		FruitList.add("guvava");
		FruitList.add("kivi");
		FruitList.add("orange");
		FruitList.add("mango");
		Collection<String> List=new ArrayList<>();
		List.add("watermelon");
		List.add("papaya");
		List.add("Straberry");
		List.addAll(FruitList);
		System.out.println(List);

	}

}
