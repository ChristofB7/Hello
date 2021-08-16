/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.cb.roshambo;

/**
 *
 * @author Christof
 */
public class SummativeSums {
    public static void main(String[] args) {
        int[] arr1 = new int[]{ 1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] arr2 = new int[]{ 999, -60, -77, 14, 160, 301};
        int[] arr3 = new int[]{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99};
        
        System.out.println("#1 Array Sum: "+ AddArray(arr1));
        System.out.println("#2 Array Sum: "+ AddArray(arr2));
        System.out.println("#3 Array Sum: "+ AddArray(arr3));
    }
    
    public static int AddArray(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        
        return sum;
    }
}
