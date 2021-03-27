package com.ch20;

public class Beer implements Comparable<Beer> {
    public String name;
    public String country;
    public float price;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public float getPrice() {
        return price;
    }

    public Beer(String name, String country, float price) {
        this.name = name;
        this.country = country;
        this.price = price;
    }

    @Override
    public int compareTo(Beer otherBeer) {
        if (this.price > otherBeer.price) {
            return 1;
        } else if (this.price < otherBeer.price) {
            return -1;
        } else return 0;

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
