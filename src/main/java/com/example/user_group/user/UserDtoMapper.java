package com.example.user_group.user;

import com.example.user_group.common.service.GenericDtoMapper;
import com.example.user_group.user.dto.UserCreateDto;
import com.example.user_group.user.dto.UserResponseDto;
import com.example.user_group.user.dto.UserUpdateDto;
import com.example.user_group.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDtoMapper extends GenericDtoMapper<User, UserCreateDto, UserUpdateDto, UserResponseDto> {

    private final ModelMapper mapper;
    @Override
    public User toEntity(UserCreateDto userCreateDto) {
        return mapper.map(userCreateDto, User.class);
    }

    @Override
    public UserResponseDto toResponseDto(User user) {
        return mapper.map(user, UserResponseDto.class);
    }

    @Override
    public void update(UserUpdateDto userUpdateDto, User user) {
         mapper.map(userUpdateDto,user);
    }

    @Override
    public UserCreateDto toCreateDto(User user) {
        return null;
    }
}
