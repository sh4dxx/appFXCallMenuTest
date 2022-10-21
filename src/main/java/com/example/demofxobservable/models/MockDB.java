package com.example.demofxobservable.models;

import java.util.ArrayList;
import java.util.List;

public class MockDB {

    public List<Person> getAllPersons(){
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Diego Gonzales"));
        peoples.add(new Person("Juan Perez"));
        return peoples;
    }
}
