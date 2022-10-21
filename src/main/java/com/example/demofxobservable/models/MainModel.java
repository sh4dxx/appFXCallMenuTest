package com.example.demofxobservable.models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;

public class MainModel {

    private final ObservableList<Person> peoples;

    public MainModel(){
        this.peoples = FXCollections.observableArrayList();
    }

    public ObservableList<Person> getNames() {
        return peoples;
    }

//    public void setNames(ObservableList<Person> names) {
//        this.peoples = names;
//    }

    public void loadFromDB(){
        MockDB db = new MockDB();
        this.peoples.clear();
        this.peoples.addAll(db.getAllPersons());
        //this.peoples = FXCollections.observableArrayList(db.getAllPersons()); // ESTA BIEN PERO ESTAMOS REINSTANCIANDO NUESTRO "ObservableList<Person> peoples"
    }

    public void delete(Person person) {
        this.peoples.remove(person);
    }

    public void insert(Person person) {
        this.peoples.add(person);
    }

    public void update(Person person) {

    }
}