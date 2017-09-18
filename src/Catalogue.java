import java.util.*;

public class Catalogue {
        private Library library;
        private List<Book> booksOnShelf = new LinkedList<Book>();
        private List<Book> booksOnLoan = new LinkedList<Book>();
        private List<Genre> genres = new LinkedList<Genre>();
        private List<Author> authors = new LinkedList<Author>();
        
     public Catalogue() {
         library = new Library();
         
     }
 }

