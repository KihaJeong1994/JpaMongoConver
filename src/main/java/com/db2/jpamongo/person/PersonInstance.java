// package com.db2.jpamongo.person;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;

// import com.db2.jpamongo.config.DbConfig;
// import com.db2.jpamongo.person.mongo.PersonDocument;
// import com.db2.jpamongo.person.rdb.PersonEntity;

// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Data
// @NoArgsConstructor
// @Component
// public class PersonInstance {
    
//     @Autowired
//     DbConfig dbConfig;

//     public Person getInstance(){
//         if(dbConfig.getDb().equals("rdb")){
//             return new PersonEntity();
//         }else{
//             return new PersonDocument();
//         }
//     }

//     Person toIf(PersonDto personDto){
//         Person person = getInstance();
//         person.setId(personDto.getId());
//         person.setFirstName(personDto.getFirstName());
//         person.setLastName(personDto.getLastName());
//         return person;
//     }
// }
