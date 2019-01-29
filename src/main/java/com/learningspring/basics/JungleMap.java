package com.learningspring.basics;

import java.util.HashMap;
import java.util.Map;

public class JungleMap {

    private Map<String, String> foods = new HashMap<>();
    private Map<String, Animal> animals = new HashMap<>();

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    public void setAnimals(Map<String, Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "JungleMap{" +
                "foods=" + foods +
                ", animals=" + animals +
                '}';
    }
}
