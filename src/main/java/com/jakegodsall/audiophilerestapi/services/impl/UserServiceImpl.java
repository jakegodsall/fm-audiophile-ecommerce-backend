package com.jakegodsall.audiophilerestapi.services.impl;

import com.jakegodsall.audiophilerestapi.entities.User;
import com.jakegodsall.audiophilerestapi.payload.UserDto;
import com.jakegodsall.audiophilerestapi.repositories.UserRepository;
import com.jakegodsall.audiophilerestapi.services.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(this::mapToDto)
                .toList();
    }

    @Override
    public UserDto getUserById(long id) {
        return null;
    }

    private UserDto mapToDto(User user) {
        return new UserDto(
                user.getId(),
                user.getUsername(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword()
        );
    }

    private User mapToEntity(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getUsername(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getPassword()

        );
    }
}
