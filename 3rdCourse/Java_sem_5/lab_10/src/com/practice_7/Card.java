package com.practice_7;

public class Card {
    private final int ID;
    private int creditBalance;
    private int ticketBalance;
    static private int countCards = 0;

    public Card(){
        countCards++;
        this.ID = countCards;
    }

    public int getCreditBalance() {
        return creditBalance;
    }
    public int getTicketBalance() {
        return ticketBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }
    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }

    @Override
    public String toString(){
        return "\n[Card ID: " + this.ID + "; credit balance: " + this.creditBalance +
                "; ticket balance: " + this.ticketBalance + "]";
    }
}
