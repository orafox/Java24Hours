package com.ch20;

public class Cat implements Comparable<Cat> {
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getCountery() {
        return countery;
    }

    String name;
    float price;
    String countery;

    public Cat(float price, String name, String countery) {
        this.price = price;
        this.name = name;
        this.countery = countery;
    }

    @Override
    public String toString() {
        return "Cat{" +
                " name='" + name + '\'' +
                ",price=" + price +
                ", countery='" + countery + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        if (o.price > price) {
            return 1;

        } else if (o.price < price) {
            return -1;
        } else {

            return 0;
        }
    }
}
