package com.learningspring.spel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

    private String id = "Default robot";
    private String speech = "Hello";


    void speak(){
        System.out.println(id +":"+speech);
    }

    public void setId(String id) {
        this.id = id;
    }

    @Autowired
    public void setSpeech( String speech) {
        this.speech = speech;
    }
}
