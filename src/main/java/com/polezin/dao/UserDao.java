package com.polezin.dao;

import com.polezin.entity.UserEntity;

import java.util.List;

public interface UserDao {

    void saveUser(UserEntity userEntity);

    void deleteUser(Long id);

    void updateUser(UserEntity userEntity);

    UserEntity getUser(Long id);

    List<UserEntity> getAllUsers();
}
