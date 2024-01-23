package com.projectNelioAlves.demo.resource;

import com.projectNelioAlves.demo.Entities.Category;
import com.projectNelioAlves.demo.Entities.Product;
import com.projectNelioAlves.demo.services.CategoryServices;
import com.projectNelioAlves.demo.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
@Autowired
    private ProductServices services;
    @GetMapping
    public ResponseEntity<List <Product>>  findAll(){      // uma lista de user
    List <Product> list =  services.findAll();
            return  ResponseEntity.ok().body(list);
    }

    @GetMapping( value = "{id}")

    public Optional<Product> findById(@PathVariable Long id ){
           return  services.findById(id);
    }
}
