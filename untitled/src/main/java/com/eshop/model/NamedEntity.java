package com.eshop.model;


public class NamedEntity extends Entity {
    private String name;

    public NamedEntity(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
