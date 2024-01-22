package com.projectNelioAlves.demo.resource;

import com.projectNelioAlves.demo.Entities.Order;
import com.projectNelioAlves.demo.Entities.User;
import com.projectNelioAlves.demo.services.OrderServices;
import com.projectNelioAlves.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
@Autowired
    private OrderServices services;
    @GetMapping
    public ResponseEntity<List <Order>>  findAll(){      // uma lista de user
    List <Order> list =  services.findAll();
            return  ResponseEntity.ok().body(list);
    }

    @GetMapping( value = "{id}")

    public Optional<Order> findById(@PathVariable Long id ){
           return  services.findById(id);
    }
}
