package com.practice_8;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private final static ArrayList<Game> GamesList = new ArrayList<>();
    private static int countGames;
    private final int id;
    private final Team awayTeam;
    private int scoresAwayTeam;
    private final Team homeTeam;
    private int scoresHomeTeam;
    private final int temperature;
    private static int maxTemperature = 0;

    static {
        countGames = 0;
    }

    private void playGame(){
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
        countGames++;
        this.id = countGames;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.temperature = temperature;
        playGame();
    }

    public void printGameStats() {
        System.out.println("\nGame #" + this.id + "\nTemperature: " + this.temperature + "\nAway team: "
                + this.awayTeam.getName() + ", scored: " + this.scoresAwayTeam + "\nHome team: "
                + this.homeTeam.getName() + ", scored: " + this.scoresHomeTeam + "\n");
    }

    // Static methods
    private static String countAvgTemperature(){
        int sumTemperature = 0;
        for (Game game : GamesList) {
            sumTemperature += game.temperature;
        }
        double avgTemperature = (double) sumTemperature / countGames;
        return Double.toString(avgTemperature);
    }

    public static void printSeasonStats() {
        for(Game game : GamesList) {
            game.printGameStats();
        }
        System.out.println("Hottest temperature: " + maxTemperature);
        System.out.println("Average temperature: " + countAvgTemperature());
    }
}
