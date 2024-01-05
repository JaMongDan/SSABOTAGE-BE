package com.jamongdan.ssabotage.domain.member.controller;

import com.jamongdan.ssabotage.domain.member.dto.JoinDTO;
import com.jamongdan.ssabotage.domain.member.service.MemberService;
import com.jamongdan.ssabotage.domain.member.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService userService;

    @PostMapping("/join")
    public ResponseEntity<?> signUp(@RequestBody JoinDTO member){
        log.debug("회원 가입 요청 user : {}", member);
        Long result = userService.join(member);
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }
}
