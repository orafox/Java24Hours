package com.ch12;

import java.util.ArrayList;
import java.util.List;

public class Ferry {
    public void loadTruck(Truck<? extends Product> truck) {

    }

    public void unloadToDock(List<? extends Product> ferryTrucks, List<? super Product> dockTruck) {
        for (Product product : ferryTrucks) {
            dockTruck.add(product);
        }
    }

    public void test() {
        List<Integer> myNumericList = new ArrayList<>();
        Integer myNumericArray[] = new Integer[myNumericList.size()];
        //myNumericArray = myNumericList.toArray();

    }


}
