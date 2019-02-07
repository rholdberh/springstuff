package com.learningspring.dbimpl.model;

import javax.inject.Named;

public class Product {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    @Named(value = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Named(value = "name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s'}", id, name);
    }
}
