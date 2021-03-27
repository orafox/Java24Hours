package com.ch20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CatDemo {
    public static void main(String[] args) {
        List<Cat> myCat = loadCat();
        myCat.forEach(System.out::println);
//        System.out.println("start sort desc");
//        Collections.sort(myCat);
//        myCat.forEach(System.out::println);
//        System.out.println("start sort asc");
//        Comparator<Cat> priceCat = Comparator.comparing(cat -> cat.price);
//        myCat.sort(priceCat);
//        myCat.forEach(System.out::println);
        Comparator<Cat> nameCat = Comparator.comparing(cat -> cat.name);
        myCat.sort(nameCat);
        System.out.println("nameSortStart====>");
        myCat.forEach(System.out::println);

    }

    public static List<Cat> loadCat() {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(8.0f, "Sanofa", "crush"));
        cats.add(new Cat(7.0f, "sara", "love"));
        cats.add(new Cat(9.0f, "shimma", "wife"));
        cats.add(new Cat(6.0f, "dalia", "unknown"));
        cats.add(new Cat(9.0f, "eman", "love"));


        return cats;
    }

}
