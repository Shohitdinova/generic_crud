package com.example.user_group.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    @Column(nullable = false)
    private boolean isPhoneNumberVerified;

    private String email;

    private String password;

}