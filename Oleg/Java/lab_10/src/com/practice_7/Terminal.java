package com.practice_7;

public class Terminal {
    public final PrizeCategory[] prizes = new PrizeCategory[3];
    public Terminal(){
        this.prizes[0] = new PrizeCategory("Teddy Bear", 3, 5);
        this.prizes[1] = new PrizeCategory("Toy M-16", 5, 1);
        this.prizes[2] = new PrizeCategory("Balloon", 2, 10);
    }
    public void receiveCardAndMoney(Card card, int money){
        card.setCreditBalance(2*money);
    }
    public void checkCardBalance(Card card){
        System.out.println(card) ;
    }
    public void transferCreditsAndTickets(Card cardTransferFrom, Card cardTransferTo){
        cardTransferTo.setCreditBalance(cardTransferTo.getCreditBalance() + cardTransferFrom.getCreditBalance());
        cardTransferFrom.setCreditBalance(0);
        cardTransferTo.setTicketBalance(cardTransferTo.getTicketBalance() + cardTransferFrom.getTicketBalance());
        cardTransferFrom.setTicketBalance(0);
    }
    public void getPrize(Card card, int prizeCategory){
        if(this.prizes[prizeCategory].getPrizeAmount() == 0 ||
                this.prizes[prizeCategory].TICKET_COST > card.getTicketBalance()){
            System.out.println("Error!");
        } else {
            this.prizes[prizeCategory].takePrize();
            card.setTicketBalance(card.getTicketBalance() - this.prizes[prizeCategory].TICKET_COST);
        }
    }
}
