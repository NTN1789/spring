package com.projectNelioAlves.demo.services;

import com.projectNelioAlves.demo.Entities.Order;
import com.projectNelioAlves.demo.Entities.User;
import com.projectNelioAlves.demo.Repository.OrderRepository;
import com.projectNelioAlves.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {

    @Autowired
    private OrderRepository repository;


    public List<Order> findAll(){
            return  repository.findAll();
    }


    public Optional<Order> findById(Long id){

        return  repository.findById(id);
    }


}
