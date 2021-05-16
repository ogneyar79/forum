package forum.repository;

import forum.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface IPostRepository extends CrudRepository<Post, Long> {


}
