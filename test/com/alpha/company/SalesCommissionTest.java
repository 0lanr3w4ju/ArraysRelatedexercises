package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesCommissionTest {

    @Test
    void testThatSalaryIs200() {
        SalesCommission salesCommission = new SalesCommission();
        assertEquals(200, salesCommission.getSALARY());
    }

    @Test
    void testThatCommissionRateIs9Percent() {
        SalesCommission salesCommission = new SalesCommission();
        assertEquals(0.09, salesCommission.getCOMMISSION_RATE());
    }

    @Test
    void testThatSalesCommissionCalculatorWorks() {
        SalesCommission salesCommission = new SalesCommission();
        assertEquals(650, salesCommission.salesCommissionCalculator(5000));
    }
}