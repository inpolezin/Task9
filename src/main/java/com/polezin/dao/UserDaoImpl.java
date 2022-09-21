package com.polezin.dao;

import com.polezin.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private final EntityManager entityManager;


    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public void saveUser(UserEntity userEntity) {
        entityManager.persist(userEntity);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.remove(getUser(id));
    }

    @Override
    public void updateUser(UserEntity userEntity) {
        entityManager.merge(userEntity);
    }

    @Override
    public UserEntity getUser(Long id) {
        return entityManager.find(UserEntity.class, id);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return entityManager.createQuery("SELECT a FROM UserEntity a", UserEntity.class).getResultList();
    }
}
