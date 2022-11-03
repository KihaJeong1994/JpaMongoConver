package com.db2.jpamongo.person.rdb;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.db2.jpamongo.person.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Person")
@AllArgsConstructor
@NoArgsConstructor
// @MappedSuperclass
// @EntityListeners(AuditingEntityListener.class)
public class PersonEntity implements Person{
    @Id
    private String id;
    private String firstName;
    private String lastName;
    

}
