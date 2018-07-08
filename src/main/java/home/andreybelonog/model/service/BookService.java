package home.andreybelonog.model.service;

import home.andreybelonog.model.entity.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    void deleteBook(long id);

    void updateBook(Book book);

    List<Book> getAll();

    Book getById(long id);
}
