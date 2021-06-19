package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

//    a) Set the 10 elements of integer array counts to zero.
    @Test
    void testThatArrayCountElementsIsEqualsZero() {
        int[] counts = new int[10];
        for (int ignored:
             counts) {
            assertEquals(0, ignored);
        }
    }

//    b) Add one to each of the 15 elements of integer array bonus.
    @Test
    void testThatOneIsAddedToBonusArrayElements() {
        int expectedNO=1;
        int[] bonus = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int index=0; index<bonus.length; index++) {
            bonus[index]++;
            expectedNO++;
            assertEquals(expectedNO, bonus[index]);
        }
    }
}