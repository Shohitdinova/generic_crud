package com.example.user_group.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPatchDto{

    private String firstName;

    private String lastName;


    private String email;

    private String phoneNumber;
}
