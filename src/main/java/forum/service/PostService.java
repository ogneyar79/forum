package forum.service;

import forum.model.Post;
import forum.repository.IPostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final IPostRepository posts;

    public PostService(IPostRepository posts) {
        this.posts = posts;
    }

    public List<Post> getAll() {
        System.out.println(" PostService getAll 20");
        List<Post> rsl = new ArrayList<>();
        posts.findAll().forEach(rsl::add);
        System.out.println("rsl collection are ready to return");
        return rsl;
    }
}
