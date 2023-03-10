package com.practice_7;

import java.util.Random;

public class SlotMachine {
    private final String GAME_NAME;
    private final int GAME_COST;

    public SlotMachine(String name, int gameCost){
        this.GAME_NAME = name;
        this.GAME_COST = gameCost;
    }

    public void receiveCard(Card card){
        if(card.getCreditBalance() < this.GAME_COST) {
            System.out.println("You haven't enough credit on your card to play!");
        } else {
            Random rand = new Random();
            card.setCreditBalance(card.getCreditBalance() - this.GAME_COST);
            card.setTicketBalance(rand.nextInt(10) + 1);
            System.out.println(card);
        }
    }
}
