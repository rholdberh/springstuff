package com.learningspring.anotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("anotations/beans.xml");
        Logger logger = (Logger) context.getBean("logger");
        logger.writeFile("blafile");
        logger.writeConsole("blaconsole");
        logger.writeGod("Hi");
        logger.writeWife("Hi wife");

    }
}
