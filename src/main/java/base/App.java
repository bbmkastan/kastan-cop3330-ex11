
package base;

import  java.math.RoundingMode;
import  java.text.DecimalFormat;
import  java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Bao Kastan
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double euros = myApp.getEuros();
        double rate = myApp.getRate();
        double dollars = euros * rate;

        myApp.printOutput(euros, rate, dollars);
    }

    public double getRate() {
        System.out.println("What is the exchange rate?");
        return in.nextDouble();
    }

    public double getEuros() {
        System.out.println("How many euros are you exchanging?");
        return in.nextDouble();
    }

    public void printOutput(double euros, double rate, double dollars) {
        DecimalFormat formatMoney = new DecimalFormat("#.00");
        formatMoney.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println(formatMoney.format(euros) + " euros at an exchange rate of " + rate + " is "
                + formatMoney.format(dollars) + " U.S. dollars.");
    }
}
