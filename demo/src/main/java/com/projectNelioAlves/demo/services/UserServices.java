package com.projectNelioAlves.demo.services;

import com.projectNelioAlves.demo.Entities.User;
import com.projectNelioAlves.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;


    public List<User> findAll(){
            return  repository.findAll();
    }


    public Optional<User> findById(Long id){

        return  repository.findById(id);
    }


}
