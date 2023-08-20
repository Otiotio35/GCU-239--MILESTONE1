package salable;

/**
 * I use some java code from this site:  https://raw.githubusercontent.com/buckyroberts/Source-Code-from-Tutorials/master/JavaFX/018_tableView/Product.java
 * The Salable class represents a product that can be sold in a store front.
 */
public class Salable {
    private String name;
    private String description;
    private double price;
    private int quantity;

    /**
     * Constructs a Salable product with attributes.
     *
     * @param name        The name of the product.
     * @param description The description of the product.
     * @param price       The price of the product.
     * @param quantity    The quantity of the product in stock.
     */
    public Salable(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Retrieves the name of the product.
     *
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the description of the product.
     *
     * @return The description of the product.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Retrieves the quantity of the product in stock.
     *
     * @return The quantity of the product in stock.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the price of the product.
     *
     * @param price The new price of the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets the quantity of the product in stock.
     *
     * @param quantity The new quantity of the product in stock.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
