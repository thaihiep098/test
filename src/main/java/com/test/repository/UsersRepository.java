package com.test.repository;

import com.test.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, String>{
    UsersEntity findUsersByName(String name);
    UsersEntity findByEmail(String email);
}
