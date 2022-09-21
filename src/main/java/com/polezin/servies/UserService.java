package com.polezin.servies;

import com.polezin.entity.UserEntity;

import java.util.List;

public interface UserService {

    void saveUser(UserEntity userEntity);

    void deleteUser(Long id);

    void updateUser(UserEntity userEntity);

    UserEntity getUser(Long id);

    List<UserEntity> getAllUsers();
}
