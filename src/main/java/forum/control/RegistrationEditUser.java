package forum.control;

import forum.model.UserF;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class RegistrationEditUser {

    ArrayList<UserF> users = new ArrayList<>();

    @GetMapping({"/reg"})
    public String index(Model model) {
        return "registration";
    }

    @PostMapping("/registrn")
    public String save(@ModelAttribute("accident") UserF user) {
        System.out.println("Controller RC method post /registration");
        System.out.println(" User was got  user.id :" + user.getId() + " User id:" + user.getUsername());
        users.add(user);
        return ":/";
    }

    @PostMapping("/edit")
    public String edit(@RequestParam("id") long id, Model model) {
        System.out.println("Controller RC method post /edit");
        model.addAttribute("user", users.get((int) id));
        return "edituser";
    }

    @PostMapping("/update")
    public String updateAccident(@RequestParam("id") String id, @ModelAttribute("user") UserF user) {
        System.out.println(" REU Method update with Model Attribute id :" + id);

        System.out.println(" Accident id :" + user.getId());
        System.out.println(" Accident Desc :" + user.getUsername());
        System.out.println(" Accident Location :" + user.getPassword());
        user.setId(Long.parseLong(id));

        users.add(Integer.parseInt(id), user);
        return "editusers:/";
    }

}
