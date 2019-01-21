package com.learningspring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {





        ApplicationContext context = new ClassPathXmlApplicationContext("fruitbasketbean.xml");

        Basket basket =  (Basket) context.getBean("basket");

        System.out.println(basket);

        ((ClassPathXmlApplicationContext) context).close();


//
//        ApplicationContext context = new ClassPathXmlApplicationContext("beansbasics.xml");
//
//        Person person1 =  (Person) context.getBean("person2");
//
//        System.out.println(person1.toString());
//
//        ((ClassPathXmlApplicationContext) context).close();

    }

}
