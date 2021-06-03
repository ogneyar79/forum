package forum.repository;

import forum.model.Userr;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<Userr, Long> {


    Userr findByUsername(String username);

    Userr findByEmail(String email);
}
