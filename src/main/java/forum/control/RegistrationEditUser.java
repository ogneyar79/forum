package forum.control;

import forum.model.Authority;
import forum.model.Userr;
import forum.repository.IAuthorityRepository;
import forum.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class RegistrationEditUser {

    private UserService service;
    private final IAuthorityRepository authorities;
    private final PasswordEncoder encoder;

    public RegistrationEditUser(UserService service, IAuthorityRepository authorities, PasswordEncoder encoder) {
        this.service = service;
        this.authorities = authorities;
        this.encoder = encoder;
    }

    private static final Logger log = Logger.getLogger(RegistrationEditUser.class.getName());

    @GetMapping({"/reg"})
    public String index(Model model) {
        log.info(" method /req 22 redirect jsp registration");
        return "registration";
    }

    @PostMapping("/registrn")
    public String save(@ModelAttribute("userr") Userr user, Model model) {
        log.info("Controller RC 39 method post save /registration");
        user.setEnabled(true);
        user.setPassword(encoder.encode(user.getPassword()));
        user.setAuthority(authorities.findByAuthority("USER"));
        Authority authority = user.getAuthority();
        log.info(" User was got  user.id :" + user.getId() + " User name:" + user.getUsername());
        log.info(" User Authority :" + authority + "UserName" + user.getUsername());
        service.save(user);
        log.info(" Before return redirect");
        return "redirect:/login";
    }

    @PostMapping("/edit")
    public String edit(@RequestParam("id") long id, Model model) {
        log.info("Controller RC method post /edit");
        model.addAttribute("user", service.getById((int) id));
        return "edituser";
    }

    @PostMapping("/update")
    public String updateAccident(@RequestParam("id") String id, @ModelAttribute("user") Userr user) {
        log.info(" REU Method update with Model Attribute id :" + id);

        log.info(" User id :" + user.getId());
        log.info(" User name :" + user.getUsername());
        log.info(" User password :" + user.getPassword());
        user.setId(Long.parseLong(id));
        log.info(" User id after set id before update :" + user.getId());
        service.save(user);
        return "editusers:/";
    }
}
