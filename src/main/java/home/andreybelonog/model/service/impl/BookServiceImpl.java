package home.andreybelonog.model.service.impl;

import home.andreybelonog.model.entity.Book;
import home.andreybelonog.model.repository.BookRepository;
import home.andreybelonog.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;


    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        Book tempBook = new Book();

        tempBook.setTitle(book.getTitle());
        tempBook.setAuthorFullName(book.getAuthorFullName());
        tempBook.setDescription(book.getDescription());

        bookRepository.saveAndFlush(tempBook);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    public Optional<Book> getById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.saveAndFlush(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
