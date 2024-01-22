package com.projectNelioAlves.demo.services;

import com.projectNelioAlves.demo.Entities.Category;
import com.projectNelioAlves.demo.Entities.User;
import com.projectNelioAlves.demo.Repository.CategoryRepository;
import com.projectNelioAlves.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository repository;


    public List<Category> findAll(){
            return  repository.findAll();
    }


    public Optional<Category> findById(Long id){

        return  repository.findById(id);
    }


}
