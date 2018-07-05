package home.andreybelonog.controllers;

import home.andreybelonog.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BookController {

    private static final String TEMPLATE = "Here you will see: %s";
    private static AtomicLong counter = new AtomicLong();

    @GetMapping("api/get-book")
    public Book getBook(@RequestParam(value = "name", defaultValue = "DefaultBook") String name){
        return new Book(counter.incrementAndGet(),
                        String.format(TEMPLATE, name));
    }
}
