package com.ch12;

import java.util.ArrayList;
import java.util.List;

public class Truck<T> {
    private List<T> products = new ArrayList<>();

    public void add(T t) {
        products.add(t);
    }

    public List<T> getProducts() {
        return products;
    }

}
