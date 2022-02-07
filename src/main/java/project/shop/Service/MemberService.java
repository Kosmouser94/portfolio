package project.shop.Service;


import org.springframework.stereotype.Service;
import project.shop.Entity.Member;

import java.util.List;


public interface MemberService {
    Member save(Member member);
    List<Member> findAll();
    Member findByMemberAccount(String memberAccount);







}
