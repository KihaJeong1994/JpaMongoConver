package com.db2.jpamongo.person;

import java.util.List;

public interface PersonRepository<T>{ //Person으로 고정 시 JpaRepository나 MongoRepository가 상속 시 method 충돌
    List<Person> findAll();
    Person save(Person person);
}
