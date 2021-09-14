package com.isaccanedo.demo.controller;

import com.isaccanedo.demo.model.PersonDTO;
import com.isaccanedo.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/persons/")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = "with30/")
    public List<PersonDTO> getPersonsWith30(){
        List<PersonDTO> persons = new ArrayList<>();
        persons = personRepository.getPersonsWith30();
        return persons;
    }

}
