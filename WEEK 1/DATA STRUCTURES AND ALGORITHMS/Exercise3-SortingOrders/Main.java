public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Rahul", 3000),
                new Order(102, "Anu", 1000),
                new Order(103, "John", 5000)

        };

        System.out.println("Bubble Sort");

        Sort.bubbleSort(orders);

        for (Order o : orders)
            o.display();

        Order[] orders2 = {

                new Order(101, "Rahul", 3000),
                new Order(102, "Anu", 1000),
                new Order(103, "John", 5000)

        };

        System.out.println("\nQuick Sort");

        Sort.quickSort(orders2, 0, orders2.length - 1);

        for (Order o : orders2)
            o.display();

    }

}