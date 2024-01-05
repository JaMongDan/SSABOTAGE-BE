package com.jamongdan.ssabotage.domain.member.service;

import com.jamongdan.ssabotage.domain.member.dto.JoinDTO;
import com.jamongdan.ssabotage.domain.member.entity.Member;
import com.jamongdan.ssabotage.domain.member.repository.MemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;

    // 회원 가입
    public Long join(JoinDTO member) {
        Member newMember = Member.builder()
                .memberId(member.getId())
                .password(member.getPassword())
                .email(member.getEmail())
                .build();
        memberRepository.save(newMember);
        return newMember.getId();
    }
}
