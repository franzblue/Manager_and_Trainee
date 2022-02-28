package com.perscholas.java_basics;

public class Trainee extends Employee {

    public Trainee(long employeeId, String employeeName, String employeeAddress, Long employeePhone, double salary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        basicSalary = salary;
    }
}
