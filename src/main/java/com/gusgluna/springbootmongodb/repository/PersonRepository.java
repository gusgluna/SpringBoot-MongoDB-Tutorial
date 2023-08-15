package com.gusgluna.springbootmongodb.repository;

import com.gusgluna.springbootmongodb.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByFirstNameStartsWith(String name);

}
