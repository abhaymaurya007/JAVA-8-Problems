package Prob17.abhay.Exception;
public class ShoppingApplication {
    public static void main(String[] args) {
        
        Product product1 = new Product(1, "Laptop", 1000.0, 10);
        Product product2 = new Product(2, "Smartphone", 500.0, 20);
        Product product3 = new Product(3, "Headphones", 100.0, 30);

    
        ShoppingCart cart = new ShoppingCart(10);

        try {
            
            cart.addToCart(product1, 2);
            cart.addToCart(product2, 3);
            cart.addToCart(product3, 5);

            
            System.out.println("Cart Items: " + cart);
            System.out.println("Total Price: $" + cart.calculateTotal());
        } catch (InsufficientQuantityException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }

       
        try {
            ShoppingCart cart1 = new ShoppingCart(10);
            cart1.addToCart(product1, 1);
            cart1.addToCart(product2, 2);
            System.out.println("Valid Product Addition:");
            System.out.println("Cart Items: " + cart1);
            System.out.println("Total Price: $" + cart1.calculateTotal());
        } catch (InsufficientQuantityException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }

      
        try {
            ShoppingCart cart2 = new ShoppingCart(10);
            cart2.addToCart(product1, 100);
        } catch (InsufficientQuantityException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }

       
        try {
            ShoppingCart cart3 = new ShoppingCart(10);
            cart3.addToCart(null, 1);
        } catch (InsufficientQuantityException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }

     
        try {
            ShoppingCart cart4 = new ShoppingCart(1);
            cart4.addToCart(product1, 1);
            cart4.addToCart(product2, 1);
        } catch (InsufficientQuantityException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        ShoppingCart cart5 = new ShoppingCart(10);
        System.out.println("Calculate Total with Empty Cart:");
        System.out.println("Total Price: $" + cart5.calculateTotal());

        
        try {
            ShoppingCart cart6 = new ShoppingCart(10);
            cart6.addToCart(product1, 1);
            cart6.addToCart(product2, 1);
            System.out.println("Calculate Total with Mixed Products:");
            System.out.println("Cart Items: " + cart6);
            System.out.println("Total Price: $" + cart6.calculateTotal());
        } catch (InsufficientQuantityException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

