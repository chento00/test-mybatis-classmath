package com.example.test1.controller;

import com.example.test1.dto.RespondAPi;
import com.example.test1.model.Classes;
import com.example.test1.service.PersonServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class PersonController {
    private final PersonServiceImp service;

    public PersonController(PersonServiceImp service) {
        this.service = service;
    }
    @GetMapping("/person")
    ResponseEntity<?> getAllPerson(){
        RespondAPi responeAPi=new RespondAPi(
                LocalDateTime.now(),
                HttpStatus.OK,
                "Success",
                service.getAllPerson()
        );
        return ResponseEntity.ok(responeAPi);
    }
//    @PostMapping("/person")
//    void AddPerson(){
//        service.addPerson();
//    }
//    @GetMapping("/person/{id}")
//    Classes searchById(@PathVariable("id") Integer sid){
//        return service.searchById(sid);
//    }
}
