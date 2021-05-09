package forum.repository;

import forum.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository  extends CrudRepository<User, Integer> {


    User findByUsername(String username);


}
