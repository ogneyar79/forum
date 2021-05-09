package forum.service;

import forum.model.Post;
import forum.repository.IPostRepository;
import forum.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    IUserRepository usersR;

    @Autowired
    IPostRepository postR;

    private final List<Post> posts = new ArrayList<>();

    public PostService() {
        posts.add(Post.of("Продаю машину ладу 01."));
    }

    public List<Post> getAll() {
        return posts;
    }
}
