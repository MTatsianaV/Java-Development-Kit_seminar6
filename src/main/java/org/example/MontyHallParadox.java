package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MontyHallParadox {
    public static void main(String[] args) {
        int wins = 0;
        int totalGames = 20;

        for (int i = 0; i < totalGames; i++) {
            Map<Integer, String> doors = new HashMap<>();
            doors.put(1, "Автомобиль");
            doors.put(2, "Коза");
            doors.put(3, "Коза");
            System.out.println("игра №"+i);

            int initialChoice = new Random().nextInt(1, 4);
            System.out.println(initialChoice);


            if (initialChoice == 1) {
                int choiceOfPresenter = new Random().nextInt(2, 4);
                doors.remove(choiceOfPresenter);
            } else if (initialChoice == 2) {
                doors.remove(3);
            } else {
                doors.remove(2);
            }
            int newChoice = new Random().nextInt(1, 3);
            System.out.println(newChoice);

            if (newChoice == 1) {
                wins++;
                System.out.println("Win!");
            } else {
                System.out.println("Oops...");
            }
        }
        double winPercentage = (double) wins / totalGames * 100;
        System.out.println("Процент выигрышей: " + winPercentage + "%");
    }
}
