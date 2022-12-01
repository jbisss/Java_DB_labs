//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.practice_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Game {
    private static final ArrayList<Game> GamesList = new ArrayList<>();
    private static int countGames = 0;
    private final int id;
    private final Team awayTeam;
    private int scoresAwayTeam;
    private final Team homeTeam;
    private int scoresHomeTeam;
    private final int temperature;
    private static int maxTemperature = 0;

    private void playGame() {
        int goalsMax = 2 * (this.temperature / 10);
        Random randScores_1 = new Random();
        Random randScores_2 = new Random();
        this.scoresAwayTeam = randScores_1.nextInt(goalsMax + 1);
        this.scoresHomeTeam = randScores_2.nextInt(goalsMax + 1);
        this.awayTeam.increaseGoals(this.scoresAwayTeam);
        this.awayTeam.increaseAllowedGoals(this.scoresHomeTeam);
        this.awayTeam.incrementTotalGames();
        this.homeTeam.increaseGoals(this.scoresHomeTeam);
        this.homeTeam.increaseAllowedGoals(this.scoresAwayTeam);
        this.homeTeam.incrementTotalGames();
        if (this.scoresAwayTeam > this.scoresHomeTeam) {
            this.awayTeam.incrementVictories();
            this.homeTeam.incrementLoses();
        } else if (this.scoresAwayTeam < this.scoresHomeTeam) {
            this.awayTeam.incrementLoses();
            this.homeTeam.incrementVictories();
        } else {
            this.awayTeam.incrementTies();
            this.homeTeam.incrementTies();
        }

        maxTemperature = Math.max(this.temperature, maxTemperature);
        GamesList.add(this);
    }

    public Game(Team awayTeam, Team homeTeam, int temperature) {
        ++countGames;
        this.id = countGames;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.temperature = temperature;
        this.playGame();
    }

    public void printGameStats() {
        int name = this.id;
        System.out.println("\nGame #" + name + "\nTemperature: " + this.temperature + "\nAway team: " + this.awayTeam.getName() + ", scored: " + this.scoresAwayTeam + "\nHome team: " + this.homeTeam.getName() + ", scored: " + this.scoresHomeTeam + "\n");
    }

    private static String countAvgTemperature() {
        int sumTemperature = 0;

        Game game;
        for(Iterator var1 = GamesList.iterator(); var1.hasNext(); sumTemperature += game.temperature) {
            game = (Game)var1.next();
        }

        double avgTemperature = (double)sumTemperature / (double)countGames;
        return Double.toString(avgTemperature);
    }

    public static void printSeasonStats() {
        Iterator iterator = GamesList.iterator();

        while(iterator.hasNext()) {
            Game game = (Game)iterator.next();
            game.printGameStats();
        }

        System.out.println("Hottest temperature: " + maxTemperature);
        System.out.println("Average temperature: " + countAvgTemperature());
    }
}
