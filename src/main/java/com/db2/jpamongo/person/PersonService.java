package com.db2.jpamongo.person;

import java.util.List;

import org.springframework.stereotype.Service;

import com.db2.jpamongo.config.DbConfig;
import com.db2.jpamongo.person.mongo.PersonDocument;
import com.db2.jpamongo.person.rdb.PersonEntity;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
    
    private final PersonRepository<Person> personRepository;

    private final DbConfig dbConfig;

    public Person getInstance(){ // controller에서 person을 매개변수로 받을 시 인터페이스를 requestbody로 받지 못하는 에러 발생
        if(dbConfig.getDb().equals("rdb")){
            return new PersonEntity();
        }else{
            return new PersonDocument();
        }
    }

    Person toIf(PersonDto personDto){
        Person person = getInstance();
        person.setId(personDto.getId());
        person.setFirstName(personDto.getFirstName());
        person.setLastName(personDto.getLastName());
        return person;
    }

    public List<Person> getPersonList(){
        return personRepository.findAll();
    }

    public Person addPerson(Person person){
        return personRepository.save(person);
    }
    
}
