import java.util.*;

public class Book {
    private String title;
    private Author author;
    private Genre genre;
    private List<Patron> holds = new LinkedList<Patron>();

    public Book(String title, Author author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public List<Patron> getHolds() {
        return holds;
    }
}
