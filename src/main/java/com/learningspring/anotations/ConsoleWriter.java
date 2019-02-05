package com.learningspring.anotations;

import org.springframework.beans.factory.annotation.Autowired;

public class ConsoleWriter implements LogWriter {

    private String bla;

    @Autowired
    public void setBla(String bla) {
        this.bla = bla;
    }


    public void write(String text){

        System.out.println("Write to console: " + text);
        System.out.println(this.bla);
    }
}
