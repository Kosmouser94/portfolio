package project.shop.Service;


import project.shop.Entity.Member;

import java.util.List;

public interface MemberService {
    Member save(Member newMember);
    List<Member> findAll();




}
