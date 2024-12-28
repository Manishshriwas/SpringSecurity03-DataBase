package com.example.SpringSecurity03_DataBase.repo;


import  com.example.SpringSecurity03_DataBase.entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<userEntity,String> {
    Optional<userEntity> findByEmail(String email);
}
