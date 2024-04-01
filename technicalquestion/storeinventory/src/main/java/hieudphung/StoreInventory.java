package hieudphung;

import java.util.HashMap;
import java.util.Map;

public class StoreInventory {

    private Map<String, Product> products;

    public StoreInventory() {
        products = new HashMap<>();
    }

    // Add a new product to the inventory.
    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    // Remove a product from the inventory by its ID.
    public void removeProduct(String id) {
        products.remove(id);
    }

    public Product getProduct(String id) {
        return products.get(id);
    }

    // Update the quantity of a product in the inventory.
    public Product updateProduct(String id, int quantity) {
        Product product = products.get(id);
        if (product != null) {
            product.setQuantity(product.getQuantity() + quantity);
        }
        return product;
    }

    // View the current inventory (list all products with their details).
    public int viewInventory() {
        for (Product prod : products.values()) {
            System.out.printf("Product '%s'\n ID: %s\n Price: %s\n Quantity: %s\n\n", prod.getName(), prod.getId(), prod.getPrice(), prod.getQuantity());
        }
        return products.size();
    }

    // Calculate and display the total value of the inventory.
    public double valueInvetory() {
        double total = 0;
        for (Product prod : products.values()) {
            total += prod.getPrice() * prod.getQuantity();
        }
        System.out.println("\nTotal value of inventory: " + total);
        return total;
    }

}
