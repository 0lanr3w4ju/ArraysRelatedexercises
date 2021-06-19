package com.alpha.company;

public class DuplicateElimination {

//    Use a one-dimensional array to solve the following problem:
//    an application that inputs five numbers, each between 10 and 100, inclusive.
//    As each number is read, display it only if it’s not a duplicate of a number already read.
//    Provide for the “worst case,” in which all five numbers are different.
//    Use the smallest possible array to solve this problem.
//    Display the complete set of unique values input after the user enters each new value.

    int index = 0;

    private final int SIZE = 5;

    int[] fiveElementArray = new int[SIZE];

    public void unknown(int uniqueNumber) {

        if (index == fiveElementArray.length) {

            System.out.println("array is full");

        } else if ((uniqueNumber >= 10 && uniqueNumber <= 100) && fiveElementArray[index] == 0) {

            if (uniqueNumber == fiveElementArray[0]) {
                return;
            } else if (uniqueNumber == fiveElementArray[1]) {
                return;
            } else if (uniqueNumber == fiveElementArray[2]) {
                return;
            } else if (uniqueNumber == fiveElementArray[3]) {
                return;
            } else if (uniqueNumber == fiveElementArray[4]) {
                return;
            } else fiveElementArray[index] = uniqueNumber;

            index++;

        }

    }
}