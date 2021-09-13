/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // prompt for length
        System.out.print("Enter length of room: ");

        // read length
        double length = input.nextDouble();

        // prompt for width
        System.out.print("Enter width of room: ");

        // read width
        double width = input.nextDouble();

        // calculate area
        double area = length * width;

        // init constant
        double gallonCovers = 350;

        // calculate total number of gallons needed
        int numGallons = (int)Math.ceil(area / gallonCovers);

        // output results
        System.out.print("You will need to purchase " + numGallons + " gallons of paint to cover " + (int)area +" square feet.");
    }
}
