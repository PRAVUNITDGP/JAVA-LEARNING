package com.learning.LLD.TicTac;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        String Winner = game.startGame();
        System.out.println("The Winner is -->> " + Winner );
    }
}
