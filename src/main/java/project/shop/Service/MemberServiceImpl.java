package project.shop.Service;

import org.springframework.stereotype.Service;
import project.shop.Entity.Member;
import project.shop.Repository.MemberRepository;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;



    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member save(Member member) {
        Member save = memberRepository.save(member);
//        CartRepository.save(save.getId());
        return save;
    }



    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Member findByMemberAccount(String memberAccount) {
        return memberRepository.findByMemberAccount(memberAccount);
    }

    //    @Override
//    public Member findByAccount(String memberAccount) {
//        return memberRepository.findByAccount(memberAccount);
//    }

    //
//    @Override
//    public Member findByAccount(String memberAccount) {
//        return memberRepository.findByAccount(memberAccount);
//    }

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
