package forum.control;

import forum.model.Post;
import forum.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping({"/editpost"})
    public String editPost(@RequestParam("id") int id, Model model) {
        log.info(" GetMaping /editpost 41");
        model.addAttribute("post", posts.findById(id));
        return "changepost";
    }

    @PostMapping("/updatepost")
    public String updatePost(@RequestParam("id") String id, @ModelAttribute("post") Post post) {
        log.info(" 48 PM /updatepost");
        log.info(" Post id :" + post.getId());
        log.info(" Post description :" + post.getDescription());
        post.setId((int) Long.parseLong(id));
        post.setCreated(new Date(System.currentTimeMillis()));
        log.info(" Post id after set id before update :" + post.getId());
        posts.create(post);
        return "redirect:index";
    }


}
