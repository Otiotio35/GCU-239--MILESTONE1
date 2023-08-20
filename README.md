Retail Application


Java Store Front simulates a basic shopping experience. The app lets you manage inventory, add items to a cart, and check out. The project has 4 packages with different functions.


Structure of Project


The project has four packages:


Menu: Contains the application's main class StoreFront. It initializes inventory, adds products, creates a shopping cart, adds products, and checks out.


Inventory: Manages salable product inventory with the InventoryManager class. It lets you add, remove, and search for inventory items.


Shopping: ShoppingCart represents the shopping cart. It lets you add and remove products with quantities, calculate the cart total, and checkout.


Salable: Store-saleable products are in this class. Name, description, price, and quantity are its attributes.


How to Use


Adding Products to Inventory: In the StoreFront class's main method, you can use the InventoryManager's addProduct method to create instances of Salable products and add them to inventory.


Adding Products to the Shopping Cart: After adding products to the inventory, create a new instance of ShoppingCart and use its addItem method to add products with quantities to the cart.


View Shopping Cart Total Price: The ShoppingCart class's getTotalPrice method calculates the cart's total price.


To simulate checkout, call the ShoppingCart class's checkout method. For simplicity, this method displays a checkout completed message.
