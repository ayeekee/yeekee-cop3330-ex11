package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String numEuro = se.nextLine();
        double euro = Double.parseDouble(numEuro);

        System.out.print("What is the exchange rate? ");
        String exRate = se.nextLine();
        double rate = Double.parseDouble(exRate);

        double dollars = euro * rate;

        System.out.println(String.format("%.0f", euro) + " euros at an exchange rate of " + rate + " is\n" + String.format("%.2f", dollars) + " U.S. dollars.");
    }
}
