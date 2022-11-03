package com.db2.jpamongo.person;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    
    private final PersonService personService;
    // private final PersonInstance personInstance;
    
    @GetMapping("")
    public List<Person> getPersonList(){
        return personService.getPersonList();
    }

    @PostMapping("")
    public Person addPerson(@RequestBody PersonDto personDto){
        return personService.addPerson(personService.toIf(personDto));
    }
}
