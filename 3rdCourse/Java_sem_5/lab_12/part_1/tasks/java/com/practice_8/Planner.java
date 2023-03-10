//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.practice_8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Planner {
    public Planner() {
    }

    public static void startSeason() {
        Team[] teamArray = new Team[]{new Team("Liverpool"), new Team("Real Madrid"), new Team("Barcelona"), new Team("Manchester City")};
        int countColdDays = 0;
        Scanner in = new Scanner(System.in);

        do {
            while(true) {
                int temperature = 101;
                while(true) {
                    try {
                        while(temperature > 100) {
                            System.out.println("Enter the value of temperature:");
                            String input = in.nextLine();
                            temperature = Integer.parseInt(input);
                            if(temperature > 100) {
                                System.out.println("Too high!!!");
                            }
                        }
                        break;
                    } catch (ClassCastException var10) {
                        var10.printStackTrace();
                    }
                }

                if (temperature < 0) {
                    System.out.println("Too cold to play!!!");
                    ++countColdDays;
                    break;
                }

                Set<Integer> numberSet = new HashSet<>(Arrays.asList(0, 1, 2, 3));
                countColdDays = 0;
                Random rand_1 = new Random();
                Random rand_2 = new Random();
                int firstTeamNumber = 0;

                int secondTeamNumber;
                for(secondTeamNumber = 0; firstTeamNumber == secondTeamNumber; secondTeamNumber = rand_2.nextInt(4)) {
                    firstTeamNumber = rand_1.nextInt(4);
                }

                numberSet.remove(firstTeamNumber);
                numberSet.remove(secondTeamNumber);
                Game game_1 = new Game(teamArray[firstTeamNumber], teamArray[secondTeamNumber], temperature);
                Iterator<Integer> iterator = numberSet.iterator();
                firstTeamNumber = iterator.next();
                secondTeamNumber = iterator.next();
                Game game_2 = new Game(teamArray[firstTeamNumber], teamArray[secondTeamNumber], temperature);
                game_1.printGameStats();
                game_2.printGameStats();
            }
        } while(countColdDays != 3);

        int length = teamArray.length;

        for(int i = 0; i < length; ++i) {
            Team team = teamArray[i];
            team.printStats();
        }

        Game.printSeasonStats();
    }
}
