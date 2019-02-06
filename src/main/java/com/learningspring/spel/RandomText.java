package com.learningspring.spel;

import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.util.Random;

@Component
@Named(value = "callmetogettext")
public class RandomText {
    private static String[] texts = {
            "some text",
            "some text2",
            "some text3",
            "some text4",
            null
    };

    public String getText(int i){
        Random rnd = new Random();
        return texts[i];
    }
}
