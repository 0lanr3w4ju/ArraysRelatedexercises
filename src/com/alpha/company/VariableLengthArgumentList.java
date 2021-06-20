package com.alpha.company;

public class VariableLengthArgumentList {

    public int product(int...numbers) {
        int total = 1;
        for (int number : numbers) {
            total *= number;
        }
        return total;
    }
}
