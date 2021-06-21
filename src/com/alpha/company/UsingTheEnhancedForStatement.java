package com.alpha.company;

public class UsingTheEnhancedForStatement {

    // Write an application that uses an enhanced for statement
    // to sum the double values passed
    // by the command-line arguments.

    public static void main(String[] args) {

        double total = 0;

        for (String stringValue: args) {

            double doubleValues = Double.parseDouble(stringValue);

            total += doubleValues;

        }

        System.out.printf("total of values: %.2f%n", total);

    }
}
