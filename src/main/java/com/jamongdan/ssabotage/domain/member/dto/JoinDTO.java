package com.jamongdan.ssabotage.domain.member.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinDTO {

    @NotEmpty
    private String id;

    @NotEmpty
    private String password;

    @NotEmpty
    private String email;
}
