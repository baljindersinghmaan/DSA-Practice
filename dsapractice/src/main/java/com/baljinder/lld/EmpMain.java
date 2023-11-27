package com.baljinder.lld;

public class EmpMain {
    void call(){
        IEmployee employee = new PartTimeEmp("baksd",10);
        employee.requestTimeOff(12, new PartTimeEmp("",213));
    }
}
