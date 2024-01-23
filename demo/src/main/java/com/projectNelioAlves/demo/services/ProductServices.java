package com.projectNelioAlves.demo.services;


import com.projectNelioAlves.demo.Entities.Product;
import com.projectNelioAlves.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository repository;


    public List<Product> findAll(){
            return  repository.findAll();
    }


    public Optional<Product> findById(Long id){

        return  repository.findById(id);
    }


}
