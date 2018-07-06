package home.andreybelonog.model.repository;

import home.andreybelonog.model.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
