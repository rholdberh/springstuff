package com.learningspring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/beans.xml");
        Logger logger = (Logger) context.getBean("logger");
        logger.writeFile("blafile");
        logger.writeConsole("blaconsole");

    }
}
