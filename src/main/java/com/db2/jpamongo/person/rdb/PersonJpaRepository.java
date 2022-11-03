package com.db2.jpamongo.person.rdb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db2.jpamongo.person.Person;
import com.db2.jpamongo.person.PersonRepository;

@Repository
public interface PersonJpaRepository extends JpaRepository<PersonEntity,Object>,PersonRepository{
}
