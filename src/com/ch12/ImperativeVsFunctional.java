package com.ch12;

import java.util.ArrayList;
import java.util.List;

public class ImperativeVsFunctional {
    public static void main(String[] args) {
        List<String> winners = new ArrayList<>();
        winners.add("Eman");
        winners.add("iman");
        winners.add("shimma");
        winners.add("haya");
        boolean gotRingo = false;
        for (String winner :
                winners) {
            if ("Eman".equals(winner)) {
                gotRingo = true;
                System.out.println("Imperative style. ringo won ?" + winner+" " + gotRingo);
            }
        }

        System.out.println("Functional style. ringo won" + winners.contains("Eman"));


    }
}
