package com.learningspring.basics;

public class Address {
    private String street;
    private String streetNumber;

    public Address(){}

    public Address(String street, String streetNumber) {
        this.street = street;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
}
