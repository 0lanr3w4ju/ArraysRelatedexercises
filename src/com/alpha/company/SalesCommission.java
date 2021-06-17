package com.alpha.company;

public class SalesCommission {

    final int SALARY=200;
    final double COMMISSION_RATE=0.09;
    private int range299, range399, range499, range599, range699, range799, range899, range999, range1000;


    public int getSALARY() {
        return SALARY;
    }

    public double getCOMMISSION_RATE() {
        return COMMISSION_RATE;
    }

    public int salesCommissionCalculator(int grossSale) {
        return (int) ((COMMISSION_RATE * grossSale) + SALARY);
    }

    public void printHowManySalesPeopleEarnedInWhatRange(int...grossSales) {
        System.out.println("Salary Range");
        for (int grossSale : grossSales) {
            if (salesCommissionCalculator(grossSale) >= 200 && salesCommissionCalculator(grossSale) <= 299)
                ++range299;
            else if (salesCommissionCalculator(grossSale) >= 300 && salesCommissionCalculator(grossSale) <= 399)
                ++range399;
            else if (salesCommissionCalculator(grossSale) >= 400 && salesCommissionCalculator(grossSale) <= 499)
                ++range499;
            else if (salesCommissionCalculator(grossSale) >= 500 && salesCommissionCalculator(grossSale) <= 599)
                ++range599;
            else if (salesCommissionCalculator(grossSale) >= 600 && salesCommissionCalculator(grossSale) <= 699)
                ++range699;
            else if (salesCommissionCalculator(grossSale) >= 700 && salesCommissionCalculator(grossSale) <= 799)
                ++range799;
            else if (salesCommissionCalculator(grossSale) >= 800 && salesCommissionCalculator(grossSale) <= 899)
                ++range899;
            else if (salesCommissionCalculator(grossSale) >= 900 && salesCommissionCalculator(grossSale) <= 999)
                ++range999;
            else if (salesCommissionCalculator(grossSale) >= 1000)
                ++range1000;
        }
        System.out.printf("$%d-%d: %d%n", 200, 299, range299);
        System.out.printf("$%d-%d: %d%n", 300, 399, range399);
        System.out.printf("$%d-%d: %d%n", 400, 499, range499);
        System.out.printf("$%d-%d: %d%n", 500, 599, range599);
        System.out.printf("$%d-%d: %d%n", 600, 699, range699);
        System.out.printf("$%d-%d: %d%n", 700, 799, range799);
        System.out.printf("$%d-%d: %d%n", 800, 899, range899);
        System.out.printf("$%d-%d: %d%n", 900, 999, range999);
        System.out.printf("$%d and %s: %d%n", 1000, "over", range1000);
    }
}
