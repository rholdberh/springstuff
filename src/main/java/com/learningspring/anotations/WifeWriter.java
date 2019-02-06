package com.learningspring.anotations;


public class WifeWriter implements LogWriter {

    public void write(String text){
        System.out.println("Write to wife: " + text);
    }
}
