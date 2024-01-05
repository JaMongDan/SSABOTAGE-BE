package com.jamongdan.ssabotage.domain.member.service;

import com.jamongdan.ssabotage.domain.member.dto.JoinDTO;
import org.springframework.stereotype.Service;

public interface MemberService {
    public Long join(JoinDTO member);
}
