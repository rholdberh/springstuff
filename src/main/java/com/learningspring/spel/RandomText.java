package com.learningspring.spel;

import java.util.Random;

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
