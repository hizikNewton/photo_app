package com.empresswest.photo_app.io.repository;

import com.empresswest.photo_app.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends CrudRepository<UserEntity,Long> {
    UserEntity findByEmail(String email);
}
