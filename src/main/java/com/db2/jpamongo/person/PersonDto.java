package com.db2.jpamongo.person;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Transient;

import com.db2.jpamongo.config.DbConfig;
import com.db2.jpamongo.person.mongo.PersonDocument;
import com.db2.jpamongo.person.rdb.PersonEntity;

import lombok.Data;

@Data
public class PersonDto{
    private String id;
    private String firstName;
    private String lastName;

    
}
