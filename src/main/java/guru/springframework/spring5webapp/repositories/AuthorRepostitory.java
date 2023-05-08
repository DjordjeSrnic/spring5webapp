package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Djordje on 08-May-23
 */
public interface AuthorRepostitory extends CrudRepository<Author, Long> {
}
