package forum.service;

import forum.model.Userr;
import forum.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class UserService {

    private static Logger log = Logger.getLogger(UserService.class.getName());
    private final IUserRepository users;

    public UserService(IUserRepository users) {
        this.users = users;
    }

    public List<Userr> getAll() {
        log.info(" UserService getAll 20");
        List<Userr> rsl = new ArrayList<>();
        users.findAll().forEach(rsl::add);
        log.info("rsl collection of Users are ready to return");
        return rsl;
    }

    public void save(Userr user) {
        log.info("User Service class UserService save 28");
         users.save(user);
    }

    public Userr getById(int id) {
        return users.findById((long) id)
                .orElse(new Userr("nullName", "nullEmail", "0000", false));
    }

    public Userr findUserByName(String username) {
        return users.findByUsername(username);
    }
}
