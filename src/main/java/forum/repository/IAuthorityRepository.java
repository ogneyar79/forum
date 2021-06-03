package forum.repository;

import forum.model.Authority;
import org.springframework.data.repository.CrudRepository;

public interface IAuthorityRepository  extends CrudRepository<Authority, Long> {

    Authority findByAuthority(String authority);
}
