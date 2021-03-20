package com.ch20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class LazyStreamsDemo {
    static List<Beer> loadCellar() {
        List<Beer> beerStock = new ArrayList<>();
        beerStock.add(new Beer("Stella", "Belgium", 7.75f));
        beerStock.add(new Beer("Sam Adams", "USA", 7.00f));
        beerStock.add(new Beer("Obolon", "Ukraine", 4.00f));
        beerStock.add(new Beer("Bud Light", "USA", 5.00f));
        beerStock.add(new Beer("Yuengling", "USA", 5.50f));
        beerStock.add(new Beer("Leffe Blonde", "Belgium", 8.75f));
        beerStock.add(new Beer("Chimay Blue", "Belgium", 10.00f));
        beerStock.add(new Beer("Brooklyn Lager", "USA", 8.25f));
        return beerStock;
    }


    public static void main(String[] args) {
        List<Beer> beers = loadCellar();
        Stream<Beer> americanBeers = beers.stream().filter(brrsss -> {
            System.out.println("inside filter:" + brrsss.country);
            return "USA".equals(brrsss.country);
        });
        DoubleStream americanBeerPrices = americanBeers.mapToDouble(brrr -> {
            System.out.println("Inside maptodouble:" + brrr.name + ":" + brrr.price);
            return brrr.price;
        });

         System.out.println("The average American beers price is $ " + americanBeerPrices.average().getAsDouble());
    }
}
