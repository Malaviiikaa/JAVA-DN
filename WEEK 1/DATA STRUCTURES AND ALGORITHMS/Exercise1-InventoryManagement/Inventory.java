import java.util.ArrayList;

public class Inventory {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int id, int quantity) {
        for (Product p : products) {
            if (p.productId == id) {
                p.quantity = quantity;
            }
        }
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.productId == id);
    }

    public void displayProducts() {
        for (Product p : products) {
            p.display();
        }
    }

}