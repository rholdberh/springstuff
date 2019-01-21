package com.learningspring.basics;

public class Person {

    private int id;
    private String name;
    private Address address;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void speak(){

        System.out.println("I am new person");
    }

    public void setAddress(Address address) {
        this.address = address;
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
