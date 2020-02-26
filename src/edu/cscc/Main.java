package edu.cscc;
//Name: Om Borkar
//Date: 02/05/2020
//Description: The program will use an integer array of size 5 to store the prices of
// smartphones. It will then determine and print the prices of the most expensive and cheapest phones

import java.util.Arrays; // to use the sort method
import java.util.Scanner; // take user input

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); // take user input

        int[] prices = new int[5]; // Array of smartphone prices
        //Prompt the user for 5 integers
        System.out.print("Enter five integers: "); // prompt the user
        //Use a For Loop to read the five Integers
        for(int i =0; i<5; i++){
            prices[i] = input.nextInt(); // take user input
        }

        Arrays.sort(prices); // method to sort the array

        System.out.println("Three Most Expensive Phones"); // prompt the user
        System.out.println();
        for (int i=prices.length-1; i >=2; i--){
            System.out.println(prices[i]); // print the top 3 expensive phones

        }
        System.out.println();
        System.out.println("Three Cheapest Phones:  ");
        System.out.println();
        for(int i=0; i<= 2; i++){// prompt the user
            System.out.println(prices[i]); // display the three cheapest phones
        }

    }
}
