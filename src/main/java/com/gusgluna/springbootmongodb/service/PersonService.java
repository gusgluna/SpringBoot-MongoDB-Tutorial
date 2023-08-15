package com.gusgluna.springbootmongodb.service;

import com.gusgluna.springbootmongodb.collection.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getPersonStartWith(String name);
}
