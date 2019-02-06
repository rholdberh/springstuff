package com.learningspring.anotations;

import org.springframework.beans.factory.annotation.Qualifier;


public class GodWriter implements LogWriter {

    public void write(String text){
        System.out.println("Write to god: " + text);
    }
}
