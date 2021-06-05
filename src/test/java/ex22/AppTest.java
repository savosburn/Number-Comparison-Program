/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_first_and_second_num_same() {
        App myApp = new App();

        double one = 5;
        double two = 5;
        double three = 6;

        String expectedOutput = "Invalid: Some of your numbers are the same.";
        String actualOutput = myApp.testSimilarity(one, two, three);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_second_and_third_num_same() {
        App myApp = new App();

        double one = 5;
        double two = 6;
        double three = 6;

        String expectedOutput = "Invalid: Some of your numbers are the same.";
        String actualOutput = myApp.testSimilarity(one, two, three);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_first_and_third_num_same() {
        App myApp = new App();

        double one = 6;
        double two = 1;
        double three = 6;

        String expectedOutput = "Invalid: Some of your numbers are the same.";
        String actualOutput = myApp.testSimilarity(one, two, three);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_all_numbers_same() {
        App myApp = new App();

        double one = 6;
        double two = 6;
        double three = 6;

        String expectedOutput = "Invalid: Some of your numbers are the same.";
        String actualOutput = myApp.testSimilarity(one, two, three);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_first_num_largest() {
        App myApp = new App();

        double one = 51;
        double two = 1;
        double three = 2;
        double largest = myApp.findLargest(one, two, three);

        String expectedOutput = "The largest number is 51.";
        String actualOutput = myApp.generateOutput(largest);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_second_num_largest() {
        App myApp = new App();

        double one = 1;
        double two = 51;
        double three = 2;
        double largest = myApp.findLargest(one, two, three);

        String expectedOutput = "The largest number is 51.";
        String actualOutput = myApp.generateOutput(largest);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_third_num_largest() {
        App myApp = new App();

        double one = 2;
        double two = 1;
        double three = 51;
        double largest = myApp.findLargest(one, two, three);

        String expectedOutput = "The largest number is 51.";
        String actualOutput = myApp.generateOutput(largest);

        assertEquals(expectedOutput, actualOutput);
    }
}