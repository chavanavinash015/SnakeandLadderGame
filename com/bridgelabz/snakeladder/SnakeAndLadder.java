package com.bridgelabz.snakeladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake And Ladder Simulator Game");

        int POSITION = 0;
        int ROLLDICE = 0;
        System.out.println("Initial POSITION is zero");

        ROLLDICE = (int)((Math.random()*6)+1);
        System.out.println("Rolled Dice Value:" + ROLLDICE);
    }
}
