package com.bridgelabz.snakeladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake And Ladder Simulator Game");

        int POSITION = 0;
        int ROLLDICE = 0;
        int PLAYOPTION = 0;

        System.out.println("Initial POSITION is zero");

        ROLLDICE = (int)((Math.random()*6)+1);
        System.out.println("Rolled Dice Value:" + ROLLDICE);

         PLAYOPTION = (int)Math.floor(Math.random()*10)%3;
         int SNAKElADDER = (int)((Math.random()*10)+1);

         switch(PLAYOPTION){
             case 0 :
                 System.out.println("You Encountered a Ladder");
                 System.out.println("You will move " +SNAKElADDER+ " placed Ahead");
                 POSITION = ROLLDICE + SNAKElADDER;
                 break;

             case 1:
                 System.out.println("You Encounterd a Snake");
                 System.out.println("You will move =>" +SNAKElADDER+"<= Places Back");
                 POSITION = ROLLDICE - SNAKElADDER;

             case 2:
                 System.out.println("You Go no Play");
                 System.out.println("You will have to skip your turn");
                 POSITION = ROLLDICE;
                 System.out.println(POSITION);
         }
        System.out.println("Current Position : Square => "+POSITION);
    }
}
