package com.jamongdan.ssabotage.domain.member.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 생성을 데이터베이스에 위임
    private Long id;

    @NotNull
    @Column(unique = true)
    private String member_id;

    @NotNull
    private String password;

    @NotNull
    private String email;

    private LocalDateTime created_time;
    private LocalDateTime deleted_time;
    private LocalDateTime updated_time;
}
