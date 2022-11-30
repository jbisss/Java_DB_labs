package com.practice_8;

public class Team {
    private final String name;
    private int countVictories = 0;
    private int countLoses = 0;
    private int countTies = 0;
    private int countExtraMatches = 0;
    private int countCreditedGoals = 0;
    private int countEntireGoals = 0;

    public Team(String name){
        this.name = name;
    }

    public void printStats(){
        System.out.println("The name of team is: " + this.name + "\n\nVictories: " + this.countVictories + "\nLoses: "
                + this.countLoses + "\nTies: " + this.countTies + "\nExtra matches: " + this.countExtraMatches + "\nCredited goals: "
                + this.countCreditedGoals + "\nAll goals: " + this.countEntireGoals);
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

    public void increaseGoals(int goalsAdd){
        this.countEntireGoals += goalsAdd;
    }
}
