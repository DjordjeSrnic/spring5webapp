package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Djordje on 08-May-23
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
