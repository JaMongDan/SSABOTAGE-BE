package com.jamongdan.ssabotage.domain.member.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 생성을 데이터베이스에 위임
    private Long id;

    @Column(name = "member_id")
    private String memberId;

    private String password;

    private String email;

    @CreationTimestamp
    private LocalDateTime created_time;
    private LocalDateTime deleted_time;
    private LocalDateTime updated_time;

    @Builder
    private Member(String memberId, String password, String email){
        this.memberId = memberId;
        this.password = password;
        this.email = email;
    }

}
