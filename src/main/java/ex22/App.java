/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex22;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        // Input
        double numOne = myApp.readNumOne();
        double numTwo = myApp.readNumTwo();
        double numThree = myApp.readNumThree();

        // Test for similarity and terminate program if some of the numbers are the same
        // Otherwise, find the largest number
        String similarity = myApp.testSimilarity(numOne, numTwo, numThree);

        if (similarity != null) {
            System.exit(0);
        }

        double largest = myApp.findLargest(numOne, numTwo, numThree);

        // Output
        String outputString = myApp.generateOutput(largest);
        myApp.output(outputString);
    }

    public double readNumOne() {
        System.out.print("Enter the first number: ");

        // User must enter a number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid number. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public double readNumTwo () {
        System.out.print("Enter the second number: ");

        // User must enter a number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid number. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public double readNumThree() {
        System.out.print("Enter the third number: ");

        // User must enter a number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid number. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public String testSimilarity(double one, double two, double three) {
        if (one == two || one == three || two == three) {
            return "Invalid: Some of your numbers are the same.";
        }

        return null;
    }

    public double findLargest(double one, double two, double three) {
        if (one > two && one > three) {
            return one;
        } else if (two > one && two > three) {
            return two;
        } else {
            return three;
        }
    }

    public String generateOutput(double largest) {
        String biggest;

        // Converting so that integers don't show up as doubles, but doubles can still be decimals
        if (largest % 1 == 0) {
            biggest = String.valueOf((int) largest);
        } else {
            biggest = Double.toString(largest);
        }

        return String.format("The largest number is %s.", biggest);
    }

    public void output(String outputString) {
        System.out.println(outputString);
    }
}
