package com.learningspring.basics;

public class Person {

    private int id;
    private String name;
    private Address address;


    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public static Person getInstance(int id, String name) {
        System.out.println("Person: Person created using factory method.");
        return new Person(id, name);
    }


    public void speak() {
        System.out.println("I am new person");
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void init() {
        System.out.println("Person created: " + this);
    }

    public void destroy() {
        System.out.println("Person destroyed");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + address +
                '}';
    }
}
