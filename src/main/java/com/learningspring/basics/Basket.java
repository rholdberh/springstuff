package com.learningspring.basics;

import java.util.List;

public class Basket {

    private String name;
    private List<String> fruits;

    public Basket(String name, List<String> fruits) {
        this.name = name;
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" contains: \n");
        for (String fruit : fruits) {
            sb.append(fruit);
            sb.append("\n");
        }
        return sb.toString();
    }
}
