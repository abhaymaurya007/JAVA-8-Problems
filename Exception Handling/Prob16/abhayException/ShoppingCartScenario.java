package Prob16.abhayException;

public class ShoppingCartScenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ShoppingCart s1=new ShoppingCart(40);
  try {
  s1.addItem(53);
	
  
  s1.addItemUnchecked(45);
  
	}
	  catch(InvalidItemException e) {
		  System.out.println(e);}
	  catch(OutOfStockException j) {
		  System.out.println(j);
	  }
  
  System.out.println("program normally terminated");
  
  
  
  
  }

}
