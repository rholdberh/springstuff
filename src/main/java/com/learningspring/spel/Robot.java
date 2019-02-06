package com.learningspring.spel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Component
@Named(value = "nameForRobot")
public class Robot {

    private String id = "Default robot";
    private String speech = "Hello";


    public void speak(){
        System.out.println(id +":"+speech);
    }

    @Autowired
    public void setId(@Value("#{callmetogettext.getText(1).length()}") String id) {
        this.id = id;
    }


    @Autowired
    public void setSpeech(@Value("#{callmetogettext.getText(1)}") String speech) {
        this.speech = speech;
    }
}
