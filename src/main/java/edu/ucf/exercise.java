/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // prompt for number of people
        System.out.print("How many people? ");

        // create new scanner
        Scanner input = new Scanner(System.in);

        // read number of people
        int people = Integer.parseInt(input.nextLine());

        // prompt for number of pizzas
        System.out.print("How many pizzas do you have? ");

        // read number of pizzas
        int pizzas = Integer.parseInt(input.nextLine());

        // prompt for slices per pizza
        System.out.print("How many slices per pizza? ");

        // read number of slices per pizza
        int slices = Integer.parseInt(input.nextLine());

        // calculate totals
        int total = slices * pizzas;
        int slicesPerPerson = total / people;
        int slicesLeft = total % people;

        // output totals
        System.out.println(people + " people with " + pizzas + " pieces of pizza (" + total + " slices)" );
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + slicesLeft + " leftover pieces.");
    }
}
