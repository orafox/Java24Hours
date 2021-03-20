package com.ch20;

public class Beer {
    public String name;
    public String country;
    public float price;

    public Beer(String name, String country, float price) {
        this.name = name;
        this.country = country;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                '}';
    }
}
