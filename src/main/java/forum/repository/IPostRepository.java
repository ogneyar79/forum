package forum.repository;

import forum.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface IPostRepository extends CrudRepository<Post, Long> {

    Optional<Post> findById(int id);
}
