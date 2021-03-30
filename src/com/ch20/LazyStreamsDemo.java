package com.ch20;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
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

        Collections.sort(beers);

        beers.forEach(System.out::println);

        Comparator<Beer> priceComparator = Comparator.comparing(beer -> beer.price);
        System.out.println("==starting by descending price");
        beers.sort(priceComparator.reversed());
        beers.forEach(System.out::println);

        Stream<Beer> americanBeers = beers.stream().filter(brrsss -> {
            System.out.println("inside filter:" + brrsss.country);
            return "USA".equals(brrsss.country);
        });
        DoubleStream americanBeerPrices = americanBeers.mapToDouble(brrr -> {
            System.out.println("Inside maptodouble:" + brrr.name + ":" + brrr.price);
            return brrr.price;
        });
        System.out.println("start");
        beers.stream().sorted(Comparator.comparing((Beer b) -> b.country).thenComparing(b -> b.price)).forEach(System.out::println);
        List<Beer> sortedBeers = beers.stream().sorted(Comparator.comparing(b -> b.price)).collect(Collectors.toList());
        System.out.println("sorted print");
        sortedBeers.forEach(System.out::println);

        System.out.println("The average American beers price is $ " + americanBeerPrices.average().getAsDouble());


        System.out.println("==Starting by name and price");
        beers.sort(Comparator.comparing((Beer ber) -> ber.name).thenComparing(ber -> ber.price));
        beers.forEach(System.out::println);
        System.out.println("start anathor==>");
        beers.sort(Comparator.comparing(Beer::getName).thenComparing(Beer::getPrice));
        beers.forEach(System.out::println);


        beers.stream().sorted(Comparator.comparing(b -> b.price)).forEach(System.out::println);

        List<Beer> sortedBeerss = beers.stream().sorted(Comparator.comparing(b -> b.price)).collect(Collectors.toList());
        sortedBeerss.forEach(System.out::println);
        Stream<String> beerName = Stream.of("Leffe blonde", "Chimay blue", "Same Adams");
        beerName.forEach(System.out::println);
        long MaxValue = LongStream.builder().add(10).add(15).add(21).build().max().getAsLong();
        System.out.println(MaxValue);


        Optional<Beer> firstBeer = beers.stream().findFirst();
        System.out.println("the first beer in collecton :" + firstBeer.orElse(new Beer("No Name", "No countery", 0)));



    }
}
