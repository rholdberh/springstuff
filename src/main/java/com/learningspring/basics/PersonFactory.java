package com.learningspring.basics;

public class PersonFactory {
    public Person createPerson(int id, String name){
        System.out.println("PersonFactory: Using factory to create Person");
        return new Person(id, name);
    }
}
