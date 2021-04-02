package com.master;

public class Main {
    public static void main(String[] args) {

    }

    public static int calculateHighScorePositioin(int plyaerScore) {

        int position = 4;

        position = plyaerScore >= 1000 ? 1 : plyaerScore >= 500 ? 2 : plyaerScore >= 100 ? 3:4;
        return position;
    }

    public static void displayHighScorePosition(String playerName, int highScore) {
        System.out.println(playerName + " managed to get into position " +
                highScore + " on the high score table");
    }

    public static int calculatorScore(boolean gameOver, int score, int levelCompleted, int bouns) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bouns);
            finalScore +=2000;
            return finalScore;
        }
        return 1;
    }
}
