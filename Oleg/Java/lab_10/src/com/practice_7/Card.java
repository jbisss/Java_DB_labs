package com.practice_7;

public class Card {
    private int id = 0;
    private int creditBalance;
    private int ticketBalance;
    static private int countCards = 0;

    public Card(){
        countCards++;
        this.id = countCards;
    }

    public int getId() {
        return id;
    }
    public int getCreditBalance() {
        return creditBalance;
    }
    public int getTicketBalance() {
        return ticketBalance;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }
    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }

    @Override
    public String toString(){
        return "\n[Card ID: " + this.id + "; credit balance: " + this.creditBalance +
                "; ticket balance: " + this.ticketBalance + "]";
    }
}
