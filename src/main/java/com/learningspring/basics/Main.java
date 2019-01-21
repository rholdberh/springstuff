package com.learningspring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beansbasics.xml");
        Person person =  (Person) context.getBean("person");
        person.speak();

//        Address address = (Address) context.getBean("address");
//
//
//        System.out.println(address.toString());
        System.out.println(person.toString());
    }

}
