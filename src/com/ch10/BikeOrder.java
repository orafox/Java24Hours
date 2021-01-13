package com.ch10;

public class BikeOrder {
    public static void validOrder(String bikeModel,int quantity) throws TooManyException {
        throw new TooManyException("can't ship " + quantity + " bikes of the model" + bikeModel);
    }
}
