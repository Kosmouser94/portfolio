//package project.shop.Controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import project.shop.Controller.domain.LoginInput;
//import project.shop.Controller.domain.MemberInfo;
//import project.shop.Entity.Member;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import javax.validation.Valid;
//
//@Controller
//public class LoginController {
//
////
////        @PostMapping("login")
////    public String login(LoginInput loginInput, HttpSession session);
////
////
////
////        @PostMapping
////    public String login(Member member, HttpSession)
////
////
////
//////
//////
////    @PostMapping("/login")
////    public String login(LoginInput loginInput, HttpSession session) {
////        MemberInfo memberInfo = new MemberInfo(1, loginInput.getMemberAccount());
////        session.setAttribute("memberInfo", memberInfo);
////
////        return "auth/loginSuccess"; }
////
////    }
//
//
//    @PostMapping("login")
//    public String Login()
//    .findByAccount
//
//
//
//    @PostMapping("login")
//    public String login(Member member, HttpServletRequest request, HttpServletResponse response, Model model) {
//        request.getSession().setAttribute("id", member.getId()
//                .setAttribute("account", member.getMemberAccount())
//                .setAttribute("fullName", member.getMemberFullName());
//
//        return "redirect:/";
//
//
//    }
//
//
//
//    @RequestMapping(value = "/logout")
//    public String logout(HttpServletRequest request){
//        request.getSession().invalidate();
//        return "redirect:/";
//    }
//
//
//}
