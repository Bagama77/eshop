package com.eshop.model;


public class Entity {
    private long id;


    public Entity(long id) {
        this.id = id;
    }

    public Entity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                '}';
    }
}
