package com.ch05;

public class WhileLoopDemo {
    public static void main(String[] args) {
        String[] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "rose";
        friends[3] = "Shimma";
        friends[4] = "eman";
        friends[5] = "sanofa";
        friends[18] = "hillary";
        friends[19] = "natasha";
        int totalElements = friends.length;
        int i =0;
        while (i < totalElements) {
            if (friends[i] == null) {
                i++;
                continue;
            }
            System.out.println("i love " + friends[i]);
            i++;

        }
        System.out.println("the iteration is over");

    }
}
