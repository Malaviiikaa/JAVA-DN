public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Mouse", "Electronics"),
                new Product(3, "Keyboard", "Electronics")

        };

        Product p1 = Search.linearSearch(products, "Mouse");

        if (p1 != null)
            System.out.println("Linear Search: " + p1.productName);

        Product p2 = Search.binarySearch(products, "Laptop");

        if (p2 != null)
            System.out.println("Binary Search: " + p2.productName);

    }
}