package tech.buildrun.service;

import jakarta.enterprise.context.ApplicationScoped;
import tech.buildrun.entity.UserEntity;

import java.util.List;

@ApplicationScoped
public class UserService {

    public UserEntity createUser(UserEntity userEntity) {
        UserEntity.persist(userEntity);
        return userEntity;
    }

    public List<UserEntity> findAll(Integer page, Integer pageSize) {
        return UserEntity.findAll()
                .page(page, pageSize)
                .list();
    }
}
