package com.practice_7;

public class PrizeCategory {
    private String NAME;
    public final int TICKET_COST;
    private int prizeAmount;
    public PrizeCategory(String name, int ticketCost, int prizeAmount){
        this.NAME = name;
        this.TICKET_COST = ticketCost;
        this.prizeAmount = prizeAmount;
    }

    public void takePrize(){
        this.prizeAmount--;
    }
    public int getPrizeAmount() {
        return prizeAmount;
    }
}
