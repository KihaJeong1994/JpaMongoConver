package com.db2.jpamongo.person;

public interface Person{ // interface로 안하고 class 상속 시 repository에서 field 명에 대해 ambiguous하다고 에러뜸
    String getId();
    void setId(String id);
    String getFirstName();
    void setFirstName(String firstName);
    String getLastName();
    void setLastName(String lastName);

}