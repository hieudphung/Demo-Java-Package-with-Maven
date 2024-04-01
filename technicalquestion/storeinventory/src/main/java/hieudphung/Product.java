package hieudphung;

// Create a Product class with the following attributes: name, id, price, and quantity.
public class Product {
    // Product attributes
    private String name;
    private String id;
    private float price;
    private int quantity;

    public Product(String name, String id, float price, int quantity) {
        // Specific product attributes
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    // Accessing product attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
