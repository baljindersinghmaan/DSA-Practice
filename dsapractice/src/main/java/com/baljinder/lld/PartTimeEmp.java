package com.baljinder.lld;

public class PartTimeEmp extends Employee{
    public PartTimeEmp(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
    }

    @Override
    public void requestTimeOff(int nbDays, Employee manager) {

    }
}
