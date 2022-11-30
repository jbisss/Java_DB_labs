package com.practice_8;

public class Team {
    private final String name;
    private int countVictories = 0;
    private int countLoses = 0;
    private int countTies = 0;
    private int countTotalGames = 0;
    private int countAllowedGoals = 0;
    private int countEntireGoals = 0;

    public Team(String name){
        this.name = name;
    }

    public void printStats(){
        System.out.println("\nThe name of team is: " + this.name + "\nVictories: " + this.countVictories + "\nLoses: "
                + this.countLoses + "\nTies: " + this.countTies + "\nTotal games amount: " + this.countTotalGames
                + "\nGoals scored: " + this.countEntireGoals + "\nGoals allowed: " + this.countAllowedGoals + "\n");
    }

    public String getName() {
        return this.name;
    }

    public void incrementVictories(){
        this.countVictories++;
    }
    public void incrementLoses(){
        this.countLoses++;
    }
    public void incrementTies(){
        this.countTies++;
    }
    public void incrementTotalGames(){
        this.countTotalGames++;
    }

    public void increaseGoals(int goalsAdd){
        this.countEntireGoals += goalsAdd;
    }
    public void increaseAllowedGoals(int goalsAdd){
        this.countAllowedGoals += goalsAdd;
    }
}
