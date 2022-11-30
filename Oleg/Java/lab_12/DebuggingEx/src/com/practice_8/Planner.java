package com.practice_8;

import java.util.*;

public class Planner {
    public static void startSeason() {
        Team[] teamArray = new Team[4];
        teamArray[0] = new Team("Liverpool");
        teamArray[1] = new Team("Real Madrid");
        teamArray[2] = new Team("Barcelona");
        teamArray[3] = new Team("Manchester City");
        int countColdDays = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the value of temperature:");
            int temperature;
            try {
                String input = in.nextLine();
                temperature = Integer.parseInt(input);
            } catch (ClassCastException exception) {
                exception.printStackTrace();
                continue;
            }
            if (temperature < 0) {
                System.out.println("Too cold to play!!!");
                countColdDays++;
                if (countColdDays == 3) {
                    System.out.println("The season is over!!!");
                    break;
                }
            } else {
                Set<Integer> numberSet = new HashSet<>(Arrays.asList(0, 1, 2, 3));
                countColdDays = 0;
                Random rand_1 = new Random();
                Random rand_2 = new Random();
                int firstTeamNumber = 0;
                int secondTeamNumber = 0;
                while(firstTeamNumber == secondTeamNumber) {
                    firstTeamNumber = rand_1.nextInt(4);
                    secondTeamNumber = rand_2.nextInt(4);
                }
                numberSet.remove(firstTeamNumber);
                numberSet.remove(secondTeamNumber);
                new Game(teamArray[firstTeamNumber], teamArray[secondTeamNumber], temperature);
                Iterator<Integer> iterator = numberSet.iterator();
                firstTeamNumber = iterator.next();
                secondTeamNumber = iterator.next();
                new Game(teamArray[firstTeamNumber], teamArray[secondTeamNumber], temperature);
            }
        }
        for (Team team : teamArray) {
            team.printStats();
        }
        Game.printSeasonStats();
    }
}
