package com.projectNelioAlves.demo.resource;

import com.projectNelioAlves.demo.Entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
@GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"ze", "ze@gmail.com","99999999","88855");

            return  ResponseEntity.ok().body(u);
    }
}
