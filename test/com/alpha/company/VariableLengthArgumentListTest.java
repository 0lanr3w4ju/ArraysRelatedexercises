package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableLengthArgumentListTest {

    @Test
    void testThatMethodProductReturnsTheProductOfNumbersEntered() {
        VariableLengthArgumentList v = new VariableLengthArgumentList();
        assertEquals(7776, v.product(6, 6, 6, 6, 6));
    }

}