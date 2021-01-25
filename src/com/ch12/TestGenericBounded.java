package com.ch12;

public class TestGenericBounded {
    public static void main(String[] args) {
        Ferry ferry = new Ferry();
        Truck<Bike> bikes = new Truck<>();

        bikes.add(new Bike());
        bikes.add(new Bike());

        Truck<Wheel> wheels = new Truck<>();
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        wheels.add(new Wheel());

        ferry.loadTruck(bikes);
        ferry.loadTruck(wheels);

    }



}
