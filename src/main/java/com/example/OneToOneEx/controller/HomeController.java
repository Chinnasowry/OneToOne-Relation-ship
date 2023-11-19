package com.example.OneToOneEx.controller;

import com.example.OneToOneEx.entity.Address;
import com.example.OneToOneEx.entity.User;
import com.example.OneToOneEx.repository.AddressRepo;
import com.example.OneToOneEx.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserRepo repo;

    @Autowired
    AddressRepo addressRepo;

    @PostMapping
    public User saveuser(@RequestBody User user){
        return repo.save(user);
    }

    @GetMapping("/user/{id}")
    public User getuser(@PathVariable Long id){
        return repo.findById(id).get();
    }

    @GetMapping("/address/{id}")
    public Address getaddress(@PathVariable Long id){
        return addressRepo.findById(id).get();
    }
}
