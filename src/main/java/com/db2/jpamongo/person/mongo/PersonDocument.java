package com.db2.jpamongo.person.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.db2.jpamongo.person.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value="person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDocument implements Person{
    @Id
    private String id;
    private String firstName;
    private String lastName;
}
