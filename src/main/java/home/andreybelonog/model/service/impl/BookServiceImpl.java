package home.andreybelonog.model.service.impl;

import home.andreybelonog.model.entity.Book;
import home.andreybelonog.model.repository.BookRepository;
import home.andreybelonog.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;


    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        return null;
    }

    @Override
    public void deleteBook(long id) {

    }

    @Override
    public Book getByName(String name) {
        return null;
    }

    @Override
    public Book updateBook(Book book) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
