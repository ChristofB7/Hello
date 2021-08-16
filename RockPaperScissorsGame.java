/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.cb.roshambo;

import java.util.Scanner;

/**
 *
 * @author Christof
 */
public class RockPaperScissorsGame {
    public static void main(String[] args) {
        int userInput = 0, computerInput, numberOfRounds;
        int computerWins=0, playerWins=0, ties=0;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("How many rounds would you like to play?");
        numberOfRounds = Integer.parseInt(inputReader.nextLine());
        
        
        
        //Loop over until user picks quit
        for(int i=0;i<numberOfRounds+1;i++){
            System.out.println(" Select 1 for rock \n Select 2 for Paper \n Select 3 for Scissors");
            try{
               userInput = Integer.parseInt(inputReader.nextLine());
            }
            catch(NumberFormatException exception){
                //if the user types something that is not an int - not a valid input try again
                System.out.println("That's not a valid input");
                i--;
                continue;
            }
            //if the user types something that is not an int - not a valid input try again 
            if(userInput >3 || userInput <1){
                System.out.println("That's not a valid input");
                continue;
            }
            //pick a random number between 1 and 3
            computerInput = (int)((Math.random()*3)+1);
            
            switch(userInput){
                case 1 -> {
                    switch (computerInput) {
                        case 1: {System.out.println("You tied Rock with Rock");ties++;break;}
                        case 2: {System.out.println("You lose Rock to Paper.");computerWins++;break;}
                        default: {System.out.println("You win Rock to Scissors.");playerWins++;break;}
                    }
                }
                case 2 -> {
                    switch (computerInput) {
                        case 1: {System.out.println("You win Paper to Rock");playerWins++;break;}
                        case 2: {System.out.println("You tied Paper to Paper.");ties++;break;}
                        default: {System.out.println("You Lose Paper to Scissors.");computerWins++;break;}
                    }
                }
                case 3 -> {
                    switch (computerInput) {
                        case 1: {System.out.println("You lose Scissors to Rock");computerWins++;break;}
                        case 2: {System.out.println("You win Scissors to Paper.");playerWins++;break;}
                        default: {System.out.println("You tied Scissors to Scissors.");ties++;break;}
                    }
                }
                default -> System.out.println("an error has occurred");
            }
        }
        System.out.println("ties: "+ties+"\nWins: "+playerWins+"\nLosses: "+computerWins);
    }
}
