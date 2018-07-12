package home.andreybelonog.model.service.impl;

import home.andreybelonog.model.Book;
import home.andreybelonog.model.repository.BookRepository;
import home.andreybelonog.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public void addBook(Book book) {
        bookRepository.saveAndFlush(book);
    }

    @Override
    public Book getById(long id) {
        return bookRepository.getOne(id);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.saveAndFlush(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public List<Book> findAllByAuthor(String authorFullName) {
        List<Book> result = new ArrayList<>();

        for(Book b : bookRepository.findAll()){
            if(b.getAuthorFullName().equals(authorFullName)){
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public void deleteAll() {
        bookRepository.deleteAll();
    }
}
