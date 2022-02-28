package com.perscholas.java_basics;

public class Manager extends Employee {

    // constructors
    public Manager(long employeeId, String employeeName, String employeeAddress, Long employeePhone, double salary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        basicSalary = salary;
    }

    public double calculateTransportAllowance() {
        return .15d * basicSalary;
    }
}
