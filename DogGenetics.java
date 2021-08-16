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
public class DogGenetics {
    public static void main(String[] args) {
        int[] breeds = new int[5];
        Scanner inputReader = new Scanner(System.in);
        String name;
        
        System.out.println("What is your dog's name?");
        name = inputReader.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on "+name +"'s prestigious background right here.");
        System.out.println("\n"+name+" is: \n");
        
        int total = 100;
        
        //loops for everything but last
        for(int i =0; i<breeds.length-2; i++){
            //set the range to be what's left of 100%
            int range = (total-0)+1;
            //select a random number between total and 0
            double selection = Math.random()*range;
            //subtract the selection from the total
            total = total-(int)selection;
            
            breeds[i] = (int)selection;
            
        }
        //to ensure that the number adds to 100 we set the last breed to be the remaining total
        breeds[breeds.length-1] = total;
        
        String[] breedNames = new String[]{"St. Bernard","Chihuaua","Dramatic RedNosed Asian Pug","Common Cur","King Doberman"};
        
        for(int i=0; i<breeds.length;i++){
            
            System.out.println(breeds[i]+"% " + breedNames[i]);
        }
        
    }
}
