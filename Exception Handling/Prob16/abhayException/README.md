----------------------------------------------------------

16)Shopping Cart Item Addition
=================================

You are assigned to develop a Java program for a simple online shopping cart using the ShoppingCart class. The class involves 
two custom exceptions: 
-------------------------
a checked exception (InvalidItemException) and an unchecked exception (OutOfStockException). 
These exceptions are designed to handle different scenarios related to adding items to a shopping cart.

* InvalidItemException (Checked Exception):
-----------------------------------------------
-> This exception should be thrown when an attempt is made to add an invalid quantity of items (non-positive) or when there are 
not enough items in stock for the specified quantity.

* OutOfStockException (Unchecked Exception):
--------------------------------------------
-> This exception should be thrown when an attempt is made to add items exceeding the available stock.

* ShoppingCart Class:
--------------------------
-> The class should have a private instance variable availableItems representing the number of items in stock.
-> Implement a constructor to initialize the initial number of available items.
-> Implement a method addItem(int quantity) that adds items to the cart, throwing InvalidItemException for invalid quantities or 
insufficient stock.
-> Implement a method addItemUnchecked(int quantity) that simulates adding items, throwing OutOfStockException for 
quantities exceeding the available stock and handling IllegalArgumentException for invalid quantities.

* Main Class (ShoppingCartScenario):
=======================================

-> In the main method, create an instance of ShoppingCart with an initial stock of 50 items.
-> Demonstrate the use of addItem for valid and invalid quantities, handling the InvalidItemException.
-> Demonstrate the use of addItemUnchecked for valid and invalid quantities, handling both IllegalArgumentException and
OutOfStockException.

Note:
------
 Ensure that the program provides clear error messages and handles exceptions appropriately.