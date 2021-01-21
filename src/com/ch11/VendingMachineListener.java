package com.ch11;

import java.util.BitSet;

public class VendingMachineListener {
    public void phoneRinging(BitSet signal) {
        int size = signal.size();
        for (int i = 0; i < size; i++) {
            if (signal.get(i)) {
                switch (i) {
                    case 0:
                        System.out.println("box is empty");
                        break;
                    case 1:
                        System.out.println("box is half full");
                        break;
                    case 2:
                        System.out.println("box is full");
                        break;
                }
            }
        }
    }
}
