package inventory;

import java.util.ArrayList;
import java.util.List;

// Import the Salable class from the "salable" package
import salable.Salable;

/**
 * The InventoryManager class represents a manager for the inventory of salable products.
 * It allows adding and removing products from the inventory and provides a method to retrieve
 * a product by its name.
 */
public class InventoryManager {
    private List<Salable> products;

    /**
     * Constructs an empty InventoryManager with an empty list of products.
     */
    public InventoryManager() {
        this.products = new ArrayList<>();
    }

    /**
     * Adds a salable product to the inventory.
     *
     * @param product The Salable product to be added to the inventory.
     */
    public void addProduct(Salable product) {
        products.add(product);
    }

    /**
     * Removes a salable product from the inventory.
     *
     * @param product The Salable product to be removed from the inventory.
     */
    public void removeProduct(Salable product) {
        products.remove(product);
    }

    /**
     * Retrieves a salable product from the inventory by its name.
     *
     * @param name The name of the product to retrieve.
     * @return The Salable product with the specified name, or null if the product is not found in the inventory.
     */
    public Salable getProduct(String name) {
        for (Salable product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null; 
    }
}
