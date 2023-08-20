package Menu;

// Import the Salable class from the "Menu" package
import salable.Salable;

// Import the Inventory class from the "Menu" package
import inventory.InventoryManager;

// Import the ShoppingCart class from the "Menu" package
import shopping.ShoppingCart;

/**
 * The StoreFront class represents the main class for a store front application.
 * 
 * @version 7/21/2023 ID: 21024608
 * @author toafik otiotio
 */
public class StoreFront {
    /**
     * Default constructor for the StoreFront class.
     */
    public StoreFront() {
        // Add any necessary initialization or setup code here, if needed.
    }
    /**
     * The main method of the store front application.
     * It creates an instance of InventoryManager, adds some salable products to the inventory,
     * creates an instance of ShoppingCart, adds products to the cart, and performs checkout.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create an instance of InventoryManager
        InventoryManager inventory = new InventoryManager();

        // Create some salable products and add them to the inventory
        Salable product1 = new Salable("Product 1", "Description for Product 1", 10.99, 20);
        Salable product2 = new Salable("Product 2", "Description for Product 2", 5.99, 15);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Create an instance of ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();

        // Add products to the shopping cart
        shoppingCart.addItem(product1, 3);
        shoppingCart.addItem(product2, 2);

        // Display the total price in the shopping cart
        System.out.println("Total Price in Cart: $" + shoppingCart.getTotalPrice());

        // Perform checkout
        shoppingCart.checkout();
    }
}
