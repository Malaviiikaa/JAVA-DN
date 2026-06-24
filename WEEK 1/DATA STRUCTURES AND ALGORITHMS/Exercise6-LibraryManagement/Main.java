public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java", "James Gosling"),
                new Book(102, "Python", "Guido van Rossum"),
                new Book(103, "C", "Dennis Ritchie")

        };

        Book b1 = Library.linearSearch(books, "Python");

        if (b1 != null) {

            System.out.println("Linear Search:");
            b1.display();

        }

        Book b2 = Library.binarySearch(books, "Java");

        if (b2 != null) {

            System.out.println("\nBinary Search:");
            b2.display();

        }

    }

}