package com.abc.salary;

public interface SalariedIndividual {
    int getDaysWorkedInMonth();

    int getCommercialsPerDay();

//    An interface can have non-abstract methods also known as default methods - For Java Versions 8 and Up
    default double calculate(){
        int noOfDaysWorked = this.getDaysWorkedInMonth();
        int costPerDay = this.getCommercialsPerDay();
        int totalCost = noOfDaysWorked * costPerDay;
        int totalCostAfterPt = totalCost - 200;
        double tds = 0.1 * totalCostAfterPt;
        return totalCostAfterPt - tds;
    }
}

