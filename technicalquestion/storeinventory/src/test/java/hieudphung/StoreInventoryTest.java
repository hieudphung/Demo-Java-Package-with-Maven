package hieudphung;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StoreInventoryTest {

    static StoreInventory storeinventory_var;
    // Store value variable
    static int totalValue;

    // Write unit tests to perform the following actions:

    @BeforeClass
    public static void setUp() throws Exception {
        // New products
        storeinventory_var = new StoreInventory();
        storeinventory_var.addProduct(new Product("Coconut", "CN", 5, 10));
        storeinventory_var.addProduct(new Product("Pineapple", "PA", 3, 15));
        storeinventory_var.addProduct(new Product("Mango", "MG", 2, 20));
        assertEquals(3, storeinventory_var.viewInventory());

        // Testing intial value of the inventory
        totalValue = 5 * 10 + 3 * 15 + 2 * 20;
        System.out.println("Total value (initial): " + totalValue);
        assertEquals(0, Double.compare(totalValue, storeinventory_var.valueInvetory()));
    }

    @After
    public void tearDown() throws Exception {
    }

    // Test adding a new product
    @Test
    public void testAddProduct() {
        int numProducts = storeinventory_var.viewInventory();
        storeinventory_var.addProduct(new Product("Lime", "LM", 1, 25));
        totalValue += 1 * 25;
        assertEquals(++numProducts, storeinventory_var.viewInventory());
    }

    // Test removing a product
    @Test
    public void testRemoveProduct() {
        int numProducts = storeinventory_var.viewInventory();
        storeinventory_var.removeProduct("MG");
        totalValue -= 2 * 20;
        assertEquals(--numProducts, storeinventory_var.viewInventory());
    }

    // Test updating a product
    @Test
    public void testUpdateProduct() {
        int qttyProduct = storeinventory_var.getProduct("CN").getQuantity();
        int qttyAdded = 20;

        Product updatedProduct = storeinventory_var.updateProduct("CN", qttyAdded);
        totalValue += qttyAdded * updatedProduct.getPrice();
        assertEquals(qttyProduct + qttyAdded, updatedProduct.getQuantity());
    }

    // Test viewing inventory
    @Test
    public void testViewInventory() {
        System.out.println("\nTotal number of products in inventory: " + storeinventory_var.viewInventory()+ "\n");
    }

    // Test total value of inventory
    @Test
    public void testValueInvetory() {
        System.out.println("Total value of inventory: " + totalValue);
        assertEquals(0, Double.compare(totalValue, storeinventory_var.valueInvetory()));
    }

}