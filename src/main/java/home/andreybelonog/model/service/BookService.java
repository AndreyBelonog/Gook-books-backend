package home.andreybelonog.model.service;

import home.andreybelonog.model.entity.Book;

import java.util.List;

public interface BookService {
    String addBook(Book book);

    String deleteBook(long id);


    String updateBook(Book book);

    List<Book> getAll();
}
