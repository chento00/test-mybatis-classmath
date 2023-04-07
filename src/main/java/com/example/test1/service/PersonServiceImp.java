package com.example.test1.service;

import com.example.test1.model.Classes;
import com.example.test1.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService{
    private final PersonRepository repository;

    public PersonServiceImp(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Classes> getAllPerson() {
        return repository.getAllPerson();
    }

//    @Override
//    public void addPerson() {
//        repository.addPerson();
//    }
//
//    @Override
//    public Classes searchById(Integer sid) {
//        return repository.searchById(sid);
//    }
}
