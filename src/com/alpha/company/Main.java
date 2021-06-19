package com.alpha.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DuplicateElimination duplicateElimination = new DuplicateElimination();
        duplicateElimination.unknown(57);
        duplicateElimination.unknown(20);
        duplicateElimination.unknown(57);

        for (int ignored:
                duplicateElimination.fiveElementArray) {
            System.out.println(ignored);
        }

//        SalesCommission salesCommission = new SalesCommission();
//        salesCommission.printHowManySalesPeopleEarnedInWhatRange(5000, 5000, 5000);

//        c) Display the five values of integer array bestScores in column format.
//        int[] bestScores = {45, 21, 7, 9, 201};
//
//        for (int col=1; col<6; col++)
//            System.out.printf("%s%d ", "col", col);
//        System.out.println();
//        for (int el:
//             bestScores) {
//            System.out.printf("%4d ", el);
//        }
    }
}