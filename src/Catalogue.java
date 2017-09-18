import java.util.LinkedList;
import java.util.List;

public class Catalogue {
    private Library library;
    private List<Book> booksOnShelf = new LinkedList<Book>();
    private List<Book> booksOnLoan = new LinkedList<Book>();
    private List<Genre> genres = new LinkedList<Genre>();
    private List<Author> authors = new LinkedList<Author>();

    public Catalogue() {
        this.library = library;

    }

    private void booksOnShelf() {
        System.out.println();
        System.out.print("Enter a choice: ");
        System.out.print("The Library has the following books: ");
        System.out.println();
    }
}
