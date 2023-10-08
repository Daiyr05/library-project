import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books = new ArrayList<>();
    private static int counter;

    public static void add(Book book) {
        counter += 1;
        book.setId(counter);
        books.add(book);
    }

    public static Book delete(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                return b;
            }
        }
        return null;
    }

    public static void update(int id, Book book2) {
        for (Book b : books) {
            if(b.getId()==id){
                Book temp = b;
                temp.setName(book2.getName());
                temp.setTitle(book2.getTitle());
                temp.setAuthor(book2.getAuthor());
            }
        }
    }

    public static Book getBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

}
