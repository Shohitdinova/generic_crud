package com.example.user_group.user;

import com.example.user_group.common.service.GenericCrudService;
import com.example.user_group.user.dto.*;
import com.example.user_group.user.entity.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class UserService extends GenericCrudService<User, Integer, UserCreateDto, UserUpdateDto, UserPatchDto, UserResponseDto> {

    private final UserRepository repository;
    private final UserDtoMapper mapper;
    private final Class<User> entityClass = User.class;


    @Override
    protected User save(UserCreateDto userCreateDto) {
        User entity = mapper.toEntity(userCreateDto);
        User saved = repository.save(entity);
        return saved;
    }

    @Override
    protected User updateEntity(UserUpdateDto userUpdateDto, User user) {
        mapper.update(userUpdateDto, user);
        return repository.save(user);
    }


}
