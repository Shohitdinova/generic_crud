package com.example.user_group.user.dto;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class UserBaseDto {

    @NotNull
    @NotBlank(message = "auth.user.firstName.required")
    private String firstName;

    @NotBlank(message = "auth.user.lastName.required")
    private String lastName;


    @Email(message = "auth.user.email.required")
    private String email;

    @NotBlank(message = "auth.user.phoneNumber.required")
    @Pattern(regexp = "^998\\d{9}$", message = "pattern.phone.number")
    private String phoneNumber;

}
