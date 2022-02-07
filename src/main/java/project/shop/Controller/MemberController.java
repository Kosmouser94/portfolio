package project.shop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.shop.Entity.Member;
import project.shop.Repository.MemberRepository;
import project.shop.Service.MemberService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/signUp")
    public String moveSignUp() {
        return "/member/signUp";
    }

    @PostMapping("/signUp/new")
    public String sendSignUpData(Model model, Member member) {
        memberService.save(member);
        return "main";
    }

    @GetMapping("/main")
    public String moveMain() {
        return "main";
    }


    @GetMapping("/MemberList")
    public String MemberList(Model model){
        List<Member> members = memberService.findAll();
        model.addAttribute("members", members);
                return "/member/MemberList";
    }

    @GetMapping("/member/delete/{memberId}")
    public String DeleteMember(Model model, Member member, @PathVariable Long memberId) {
        memberRepository.deleteById(memberId);
        return "home";
    }


    @GetMapping("/login")
    public String getLoginPage(){
        return "/member/login";
    }



    /*
    로그인 화면에서 입력한 값을 가져오기
    > 입력한 값 account를 멤버레파지토리를 통해 DB에서 검색하기
    > 검색값이 없다면 login 화면 redirect ★
    > 검색값이 있다면 로그인화면에서 입력한 account값과 password값 을 확인하기
    > 같다면 세션에 해당 값을 가진 MemberTable에서 account와 fullName 값을 저장 후 index redirect
    > 다르다면 다시 로그인화면을 redirect ★ (★=동일한 로직)

     */
    @PostMapping("/login")
    public String Login(Model model, HttpSession session,
                        HttpServletRequest request) {
        String account = request.getParameter("memberAccount");
        String pwd = request.getParameter("memberPassword");
        Member member = memberRepository.findByMemberAccount(account);
        if(member.getMemberPassword().equals(pwd)) {
            session.setAttribute("member", member);
            Member member1 = (Member) session.getAttribute("member");
            member1.getMemberPassword();
            member1.getMemberFullName();
            System.out.println(member1.getMemberPassword());
            System.out.println(member1.getMemberFullName());
        }
//        }else {
//        }

        return "redirect:/";

    }

    @GetMapping("/logout")
    public String Logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
//    @GetMapping("Cart")
//    public String ViewCart(Model model, HttpSession session) {
//        Member member = (Member) session.getAttribute("member");
//        Long id = member.getId();
//        List<Cart> cartList = cartRepository.findByID(id);
//        if(cartList == null) {
//



}
