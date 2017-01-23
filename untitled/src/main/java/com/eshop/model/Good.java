package com.eshop.model;

import java.util.Arrays;
import java.util.List;

public class Good extends NamedEntity {

    private List<String> description;
    private double price;
    private byte[] image;


    public Good(long id, String name, List<String> description, double price, byte[] image) {
        super(id, name);
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public Good(long id, String name) {
        super(id, name);
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
     public String toString() {
        return "Good{id=" + super.getId() + ", name=" + super.getName() +
                ", description=" + description +
                ", price=" + price +
                '}';
    }
}
