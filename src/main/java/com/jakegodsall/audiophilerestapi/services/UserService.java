package com.jakegodsall.audiophilerestapi.services;

import com.jakegodsall.audiophilerestapi.payload.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    UserDto getUserById(long id);
}
