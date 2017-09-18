import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Library {
    private Catalogue catalogue;
    private List<Patron> patrons = new LinkedList<Patron>();
    private List<Book> books = new LinkedList<Book>();

    public static void main(String[] args) {
        new Library().use();
    }

    public Library() {
        this.catalogue = catalogue;
    }

    public void use() {
        char choice;
        while ((choice = readChoice()) != 'X') {
            switch (choice) {
                case '1':
                    catalogueMenu();
                    break;
                case '2':
                    patron();
                    break;
                case '3':
                    book();
                    break;
                case '4':
                    admin();
                    break;
                default:
                    help();
                    break;
            }
        }
    }

    private char readChoice() {
        System.out.println("Welcome to the Library! Please make a selection from the menu: ");
        System.out.println("1. Explore the catalogue.");
        System.out.println("2. View your patron record.");
        System.out.println("3. Show you favourite books.");
        System.out.println("4. Enter Admin Mode.");
        System.out.println("X. Exit the system.");
        System.out.print("Enter a choice: ");
        return In.nextChar();
    }

    private void readCatalogueMenu() {
        System.out.println("Welcome to the Catalogue! Please make a selection from the menu: ");
        System.out.println("1. Display all books."); // done
        System.out.println("2. Display all available books.");
        System.out.println("3. Display all genres."); //done
        System.out.println("4. Display books in a genre.");
        System.out.println("5. Display all authors."); // done
        System.out.println("6. Display all books by an author.");
        System.out.println("7. Borrow a book.");
        System.out.println("8. Return a book.");
        System.out.println("9. Place a hold.");
        System.out.println("R. Return to previous menu.");
        System.out.print("Enter a choice: ");
    }


    public void catalogueMenu() {
        readCatalogueMenu();
        ListIterator<Book> itor = books.listIterator();
        Book book = null;

        char choice = In.nextChar();
        switch (choice) {
            case '1':
                System.out.println("The Library has the following books:");
                while (itor.hasNext()) {
                    book = itor.next();
                    System.out.print(book.getTitle() + ",");
                }
                break;
            case '2':
                break;
            case '3':
                System.out.println("The Library has books in the following genres:");
                while (itor.hasNext()) {
                    book = itor.next();
                    System.out.print(book.getGenre() + ",");
                }
                System.out.print('\b');
                break;
            case '4':
                break;
            case '5':
                System.out.println("The following authors have books in this Library:");
                while (itor.hasNext()) {
                    book = itor.next();
                    System.out.print(book.getAuthor() + ",");
                }
                System.out.print('\b');
                break;
            case '6':
                break;
            case '7':
                System.out.print("\nEnter a valid patron ID:");
                int patronId = In.nextInt();
                System.out.print("Enter the title of the book you wish to borrow:");
                String title = In.nextLine();
                System.out.println("Book loaned.");
                break;
            case '8':
                break;
            case '9':
                break;
            case 'R':
                return;
        }

        catalogueMenu();
    }

    private void patron() {

    }

    private void addingPatron() {
        System.out.println("Adding a new patron.");
        System.out.print("Enter a new ID: ");
        int id = Integer.parseInt(In.nextLine());
        System.out.print("Enter the patron's name: ");
        String patronName = In.nextLine();
        System.out.print("Patron added");
        patrons.add(new Patron(id, patronName));

    }

    private void removingPatron() {
        // TODO
    }

    private void addingBook() {
        System.out.println("Adding a new book.");
        System.out.print("Enter the title of the book:");
        String title = In.nextLine();
        System.out.print("Enter the author's name:");
        Author author = new Author(In.nextLine());
        System.out.print("Enter the genre:");
        Genre genre = new Genre(In.nextLine());
        System.out.println("Added " + title + " to catalogue.");
        Book book = new Book(title, author, genre);
        books.add(book);
    }

    private void removingBook() {
        // TODO
    }

    private int readID() {
        System.out.print("Enter a patron ID: ");
        return In.nextInt();
    }

    private void book() {

    }

    private void adminMenu() {
        System.out.println("Welcome to the administration menu: ");
        System.out.println("1. Add a patron. "); // done
        System.out.println("2. Remove a patron. ");
        System.out.println("3. Add a book to the catalogue."); // done
        System.out.println("4. Remove a book from the catalogue.");
        System.out.println("R. Return to the previous menu.");
        System.out.print("Enter a choice: ");
    }

    private void admin() {
        adminMenu();
        char choice = In.nextChar();
        switch (choice) {
            case '1':
                addingPatron();
                break;
            case '2':
                removingPatron();
                break;
            case '3':
                addingBook();
                break;
            case '4':
                removingBook();
                break;
            case 'R':
            default:
                use();
                return;
        }

        admin();
    }

    private void help() {
        System.out.println("Enter a choice: ");
        System.out.println("1 = catalogueMenu");
        System.out.println("2 = patron");
        System.out.println("3 = book");
        System.out.println("4 = admin");
        System.out.println("X = exit");
    }


}
