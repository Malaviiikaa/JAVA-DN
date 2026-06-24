import java.util.Arrays;
import java.util.Comparator;

public class Library {

    public static Book linearSearch(Book[] books, String title) {

        for (Book b : books) {

            if (b.title.equalsIgnoreCase(title))
                return b;

        }

        return null;

    }

    public static Book binarySearch(Book[] books, String title) {

        Arrays.sort(books, Comparator.comparing(book -> book.title));

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = books[mid].title.compareToIgnoreCase(title);

            if (result == 0)
                return books[mid];

            if (result < 0)
                low = mid + 1;
            else
                high = mid - 1;

        }

        return null;

    }

}