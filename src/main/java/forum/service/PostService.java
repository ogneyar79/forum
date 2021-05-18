package forum.service;

import forum.model.Post;
import forum.repository.IPostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PostService {

    private final IPostRepository posts;
    private static Logger log = Logger.getLogger(PostService.class.getName());

    public PostService(IPostRepository posts) {
        this.posts = posts;
    }

    public List<Post> getAll() {
        log.info(" PostService getAll 20");
        List<Post> rsl = new ArrayList<>();
        posts.findAll().forEach(rsl::add);
        log.info("rsl collection are ready to return");
        return rsl;
    }
}
