package project.shop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.shop.Entity.Member;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public String moveHome(Model model, HttpSession session) {
        model.addAttribute("member", session.getAttribute("member"));
        return "home";
    }





}
