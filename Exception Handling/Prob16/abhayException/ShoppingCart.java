package Prob16.abhayException;

public class ShoppingCart {
  private int availableItems;

public ShoppingCart(int availableItems) {
	super();
	this.availableItems = availableItems;
}
  public void addItem(int quantity) throws InvalidItemException {
	  if(quantity>0 && quantity<=availableItems) {
		  availableItems-=quantity;
		  System.out.println("Added to cart");
	  }
	  else
		  throw new InvalidItemException("invalid amount");
  }
public void addItemUnchecked(int quantity) {
	
	if(quantity>availableItems) {
		throw new OutOfStockException("ites is out of stock");
	}
	else
	{
		availableItems-=quantity;
		  System.out.println("Added to cart");
	}
	
}





}
