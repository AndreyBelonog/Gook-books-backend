package home.andreybelonog;

public class Book {

    private long id;
    private String title;
    private String authorFirstName;
    private String authorSecondName;
    private StringBuilder description;


    public Book(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, String authorFirstName, String authorSecondName, StringBuilder description) {
        this.id = id;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
        this.description = description;
    }

    public Book(int id, String title, String authorFirstName, String authorSecondName) {
        this.id = id;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    public void setAuthorSecondName(String authorSecondName) {
        this.authorSecondName = authorSecondName;
    }

    public StringBuilder getDescription() {
        return description;
    }

    public void setDescription(StringBuilder description) {
        this.description = description;
    }
}
