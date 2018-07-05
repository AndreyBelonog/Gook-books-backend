package home.andreybelonog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String authorFullName;
    private StringBuilder description;


    public Book(){

    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String authorFullName) {
        this.title = title;
        this.authorFullName = authorFullName;
    }

    public Book(String title, String authorFullName, StringBuilder description) {
        this.title = title;
        this.authorFullName = authorFullName;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public StringBuilder getDescription() {
        return description;
    }

    public void setDescription(StringBuilder description) {
        this.description = description;
    }
}
