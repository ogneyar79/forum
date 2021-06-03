package forum.service;

import forum.model.Post;
import forum.repository.IPostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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

    public Post findById(int id) {
        log.info(" PostService findById 30");
        List<Post> rsl = new ArrayList<>();
        Post postNull = new Post();
        postNull.setId(0);
        postNull.setCreated(new Date());
        postNull.setDescription("Null object");
        postNull.setName(this.toString());
        return posts.findById((long) id).orElse(postNull);

    }

    public void create(Post post) {
        log.info(" PostService create 43");
        posts.save(post);
    }
}
