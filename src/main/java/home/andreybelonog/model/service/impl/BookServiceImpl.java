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
    public String addBook(Book book) {
        Book tempBook = new Book();

        tempBook.setTitle(book.getTitle());
        tempBook.setAuthorFullName(book.getAuthorFullName());
        tempBook.setDescription(book.getDescription());

        bookRepository.saveAndFlush(tempBook);

        return String.format("%s had successfully been added to your storage", tempBook.getTitle());
    }

    @Override
    public String deleteBook(long id) {
        bookRepository.deleteById(id);

        return "Your book has been deleted";
    }

    public Optional<Book> getById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public String updateBook(Book book) {
        bookRepository.saveAndFlush(book);

        return "Your book has been updated";
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
