package com.example.user_group.user;

import com.example.user_group.common.repository.GenericSpecificationRepository;
import com.example.user_group.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends GenericSpecificationRepository<User,Integer> {
//    Boolean existsByEmail(String email);
//    Boolean existsByPhoneNumber(String phone);
//
//    Optional<User> findUserByPhoneNumber(String phone);
}
