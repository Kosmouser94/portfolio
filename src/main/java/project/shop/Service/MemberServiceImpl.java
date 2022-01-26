package project.shop.Service;

import org.springframework.stereotype.Service;
import project.shop.Entity.Member;
import project.shop.Repository.MemberRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member save(Member newMember) {
        return memberRepository.save(newMember);
    }

    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }



//
//    public Long sign(Member newMember){
//        memberRepository.save(newMember);
//        return newMember.getId();
//    }
//

//
//
//    public List<Member> findMembers() { return memberRepository.findAll(); }

}
