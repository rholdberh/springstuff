package com.learningspring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beansbasics.xml");

        Person person1 =  (Person) context.getBean("person2");
//
//        Person person2 =  (Person) context.getBean("person");


        System.out.println(person1.toString());

        ((ClassPathXmlApplicationContext) context).close();

    }

}
