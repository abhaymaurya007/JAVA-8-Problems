package Prob17.abhay.Exception;


class ShoppingCart {
    private Product[] cartItems;
    private int itemCount;

    
    public ShoppingCart(int capacity) {
        cartItems = new Product[capacity];
        itemCount = 0;
    }

   
    public void addToCart(Product product, int quantity) throws InsufficientQuantityException, InvalidProductException {
        if (product == null) {
            throw new InvalidProductException("Product not found in the inventory.");
        }
        if (quantity > product.getQuantity()) {
            throw new InsufficientQuantityException("Requested quantity is not available.");
        }

       
        boolean productExists = false;
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getId() == product.getId()) {
                cartItems[i].setQuantity(cartItems[i].getQuantity() + quantity);
                productExists = true;
                break;
            }
        }

        // If product does not exist in the cart, add it
        if (!productExists) {
            if (itemCount >= cartItems.length) {
                throw new InvalidProductException("Shopping cart is full.");
            }
            
            Product productCopy = new Product(product.getId(), product.getName(), product.getPrice(), quantity);
            cartItems[itemCount] = productCopy;
            itemCount++;
        }

       
        product.decreaseQuantity(quantity);
    }

    
    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += cartItems[i].getPrice() * cartItems[i].getQuantity();
        }
        return total;
    }

  
}

 















