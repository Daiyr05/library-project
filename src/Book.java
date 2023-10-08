public class Book {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String title;
    private String author;

    public Book(String name, String title, String author) {
        this.name = name;
        this.title = title;
        this.author = author;
    }

    public Book(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
