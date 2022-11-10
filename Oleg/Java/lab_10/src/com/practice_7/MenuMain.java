package com.practice_7;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        // Создаём карточки и терминал
        Terminal terminal = new Terminal();
        Card firstCard = new Card();
        Card secondCard = new Card();
        // Создаём игровые автоматы
        SlotMachine game_1 = new SlotMachine("Mario", 100);
        SlotMachine game_2 = new SlotMachine("Snake", 200);
        SlotMachine game_3 = new SlotMachine("Rides", 300);

        Scanner in = new Scanner(System.in);
        boolean flag = false;
        while (!flag){
            int code = 0;
            System.out.println("Enter:");
            System.out.println("0 - to exit program");
            System.out.println("1 - to add credits to a card");
            System.out.println("2 - to play game");
            System.out.println("3 - to check balance on card");
            System.out.println("4 - to transfer credits&tickets from 1st card to 2nd");
            System.out.println("5 - to get prize");
            System.out.println("6 - to transfer credits&tickets from 2nd card to 1st");
            code = in.nextInt();
            if(code == 0){
                flag = true;
            }
            if(code == 1){
                Scanner in_card = new Scanner(System.in);
                System.out.println("Choose a card to add 1st or 2nd");
                int cardNumber = in_card.nextInt();
                System.out.println("Enter an amount of money");
                if(cardNumber == 1){
                    terminal.receiveCardAndMoney(firstCard, in_card.nextInt());
                }else{
                    terminal.receiveCardAndMoney(secondCard, in_card.nextInt());
                }
            }
            if(code == 2){
                Scanner in_game = new Scanner(System.in);
                Scanner in_card = new Scanner(System.in);
                System.out.println("Choose a card to play with 1st or 2nd");
                int cardNumber = in_card.nextInt();
                System.out.println("Choose a game to play 1st, 2nd or 3rd");
                int gameCode = in_game.nextInt();
                if(cardNumber == 1){
                    if(gameCode == 1){
                        game_1.receiveCard(firstCard);
                    }
                    if(gameCode == 2){
                        game_2.receiveCard(firstCard);
                    }
                    if(gameCode == 3){
                        game_3.receiveCard(firstCard);
                    }
                }else{
                    if(gameCode == 1){
                        game_1.receiveCard(secondCard);
                    }
                    if(gameCode == 2){
                        game_2.receiveCard(secondCard);
                    }
                    if(gameCode == 3){
                        game_3.receiveCard(secondCard);
                    }
                }
            }
            if(code == 3){
                Scanner in_card = new Scanner(System.in);
                System.out.println("Choose a card to add 1st or 2nd");
                int cardNumber = in_card.nextInt();
                if(cardNumber == 1){
                    terminal.checkCardBalance(firstCard);
                }else{
                    terminal.checkCardBalance(secondCard);
                }
            }
            if(code == 4){
                Scanner amount_credits = new Scanner(System.in);
                Scanner amount_tickets = new Scanner(System.in);
                System.out.println("Enter an amount of credits to transfer");
                int aC = amount_credits.nextInt();
                System.out.println("Enter an amount of tickets to transfer");
                int aT = amount_tickets.nextInt();
                terminal.transferCreditsAndTickets(firstCard, secondCard, aC, aT);
            }
            if(code == 6){
                Scanner amount_credits = new Scanner(System.in);
                Scanner amount_tickets = new Scanner(System.in);
                System.out.println("Enter an amount of credits to transfer");
                int aC = amount_credits.nextInt();
                System.out.println("Enter an amount of tickets to transfer");
                int aT = amount_tickets.nextInt();
                terminal.transferCreditsAndTickets(secondCard, firstCard, aC, aT);
            }
            if(code == 5){
                Scanner in_card = new Scanner(System.in);
                System.out.println("Choose a card to add 1st or 2nd");
                int cardNumber = in_card.nextInt();
                if(cardNumber == 1){
                    System.out.println("Choose a category of prize");
                    int prizeN = in_card.nextInt();
                    terminal.getPrize(firstCard, prizeN);
                }else{
                    System.out.println("Choose a category of prize");
                    int prizeN = in_card.nextInt();
                    terminal.getPrize(secondCard, prizeN);
                }
            }
        }
    }
}
