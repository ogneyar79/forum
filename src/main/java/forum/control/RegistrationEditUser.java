package forum.control;

import forum.model.UserF;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.logging.Logger;

@Controller
public class RegistrationEditUser {

    ArrayList<UserF> users = new ArrayList<>();
    private static Logger log = Logger.getLogger(RegistrationEditUser.class.getName());

    @GetMapping({"/reg"})
    public String index(Model model) {
        return "registration";
    }

    @PostMapping("/registrn")
    public String save(@ModelAttribute("accident") UserF user) {
        log.info("Controller RC method post /registration");
        log.info(" User was got  user.id :" + user.getId() + " User id:" + user.getUsername());
        users.add(user);
        return ":/";
    }

    @PostMapping("/edit")
    public String edit(@RequestParam("id") long id, Model model) {
        log.info("Controller RC method post /edit");
        model.addAttribute("user", users.get((int) id));
        return "edituser";
    }

    @PostMapping("/update")
    public String updateAccident(@RequestParam("id") String id, @ModelAttribute("user") UserF user) {
        log.info(" REU Method update with Model Attribute id :" + id);

        log.info(" Accident id :" + user.getId());
        log.info(" Accident Desc :" + user.getUsername());
        log.info(" Accident Location :" + user.getPassword());
        user.setId(Long.parseLong(id));

        users.add(Integer.parseInt(id), user);
        return "editusers:/";
    }
}
