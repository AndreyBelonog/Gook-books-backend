package home.andreybelonog.model.service;

import home.andreybelonog.model.entity.Book;

import java.util.List;

public interface BookService {
    Book addBook(Book book);

    void deleteBook(long id);

    Book getByName(String name);

    Book updateBook(Book book);

    List<Book> getAll();
}
