package forum.control;

import forum.model.Post;
import forum.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.logging.Logger;

@Controller
public class PostControl {

    private static Logger log = Logger.getLogger(PostControl.class.getName());

    private final PostService posts;

    public PostControl(PostService posts) {
        this.posts = posts;
    }

    @GetMapping({"/create"})
    public String index() {
        log.info(" GetMaping /create 24");
        return "createpost";
    }
    //   @RequestMapping(value = "/save", method = RequestMethod.POST)

    @PostMapping({"/sss"})
    public String create(@ModelAttribute Post post) {
        log.info(" PostMapping /save 32");
        post.setCreated(new Date(System.currentTimeMillis()));
        log.info("Post name:" + post.getName());
        posts.create(post);
        return "redirect:index";
    }



}
