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

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/signUp")
    public String moveSignUp() {
        return "/signUp";
    }

    @PostMapping("/signUp/new")
    public String sendSignUpData(Model model, Member member) {
//        Member newMember = new Member();
//        newMember.setAccount(member.getAccount());
//        newMember.setPassword(member.getPassword());
//        newMember.setFull_name(member.getFull_name());
//        newMember.setPhone_number(member.getPhone_number());
//        newMember.setEmail(member.getEmail());
        memberService.save(member);
        return "main";
    }

    @GetMapping("/main")
    public String moveMain() {
        return "/main";
    }


    @GetMapping("/member/MemberList")
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
    public String getLoginPage(Model model){
        return "/login";

    }



}
