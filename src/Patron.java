import java.util.LinkedList;
import java.util.List;

public class Patron {
    private int ID;
    private String name;
    private List<Book> currentlyBorrowed = new LinkedList<Book>();
    private List<Book> borrowingHistory = new LinkedList<Book>();

    public Patron(int ID, String name) {
        this.name = name;
        this.ID = ID;
    }

    public boolean getName(String name) {
        return name.equals(this.name);
    }

    @Override
    public String toString() {
        return ID + name;
    }

}
