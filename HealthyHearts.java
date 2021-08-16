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
public class HealthyHearts {

//    The maximum heart rate should be 220 - their age.
//    The target heart rate zone is 50 - 85% of the maximum.

    public static void main(String[] args) {
        int age;
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What is your age? ");
        age = Integer.parseInt(inputReader.nextLine());
        int maximum = 220- age;
        System.out.println("Your maximume HR should be " + maximum);
        
        double lowerBound = maximum*0.5;
        double upperBound = maximum*0.85;
        
        System.out.println("Your HR zone should be between" + lowerBound + " and " + upperBound);
            
    }
}
