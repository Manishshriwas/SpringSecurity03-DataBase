package com.example.SpringSecurity03_DataBase.controller;

import com.example.SpringSecurity03_DataBase.entity.userEntity;
import com.example.SpringSecurity03_DataBase.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UseController {
    @Autowired
    UserRepo userRepo;

    @GetMapping("/admin")
    public String adminKaMethod()
    {

        return "main admin huu";
    }


    @GetMapping("/user")
    public String userKaMethod()
    {
        return "main user ya admin huu";
    }

    @GetMapping("/db")
    public Optional<userEntity> abKaMethod()
    {
        return userRepo.findByEmail("manish@gmail.com");
    }

}
