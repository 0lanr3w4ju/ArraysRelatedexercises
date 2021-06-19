package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {

    @Test
    void testThatMethodDoesNotTakeDuplicates() {
        DuplicateElimination duplicateElimination = new DuplicateElimination();
        duplicateElimination.unknown(57);
        duplicateElimination.unknown(20);
        duplicateElimination.unknown(57);
        assertEquals(0, duplicateElimination.fiveElementArray[2]);
    }
}