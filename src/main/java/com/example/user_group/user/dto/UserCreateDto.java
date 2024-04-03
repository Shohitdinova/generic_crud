package com.example.user_group.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserCreateDto extends UserBaseDto {

    private String password;

}
