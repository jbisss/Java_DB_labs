package com.practice_7;

public class Main {
    public static void main(String[] args) {
        // Создаём карточки и терминал
        Terminal terminal = new Terminal();
        Card firstCard = new Card();
        Card secondCard = new Card();

        // Пополняем карточки
        terminal.receiveCardAndMoney(firstCard, 500);
        terminal.receiveCardAndMoney(secondCard, 400);

        // Создаём игровые автоматы
        SlotMachine game_1 = new SlotMachine("Mario", 100);
        SlotMachine game_2 = new SlotMachine("Snake", 200);
        SlotMachine game_3 = new SlotMachine("Rides", 300);

        // Играем в игры
        game_1.receiveCard(firstCard);
        game_2.receiveCard(secondCard);
        game_3.receiveCard(firstCard);

        // Проверяем баланс
        System.out.println("\nBefore transfer: ");
        terminal.checkCardBalance(firstCard);
        terminal.checkCardBalance(secondCard);

        // Переносим кредиты и билеты с первой карточки на вторую
        terminal.transferCreditsAndTickets(firstCard, secondCard, 500, 2);

        // Проверяем баланс
        System.out.println("\nAfter transfer: ");
        terminal.checkCardBalance(firstCard);
        terminal.checkCardBalance(secondCard);

        // Получаем призы второй карточкой
        terminal.getPrize(secondCard, 2);

        // Пытаемся сыграть в игру и получить приз с помощью первой карточки
        game_1.receiveCard(firstCard);
        terminal.getPrize(firstCard, 0);
    }
}
