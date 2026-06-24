public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(1, "Laptop", 10, 50000));
        inventory.addProduct(new Product(2, "Mouse", 50, 500));

        System.out.println("Initial Inventory");
        inventory.displayProducts();

        inventory.updateProduct(1, 15);

        System.out.println("\nAfter Update");
        inventory.displayProducts();

        inventory.deleteProduct(2);

        System.out.println("\nAfter Delete");
        inventory.displayProducts();

    }

}