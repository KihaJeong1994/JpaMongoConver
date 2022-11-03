package com.db2.jpamongo.person.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.db2.jpamongo.person.Person;
import com.db2.jpamongo.person.PersonRepository;

@Repository
public interface PersonMongoRepository extends MongoRepository<PersonDocument,Object>,PersonRepository{
    
}
