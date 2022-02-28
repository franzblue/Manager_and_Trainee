package com.perscholas.java_basics;

public class Employee {
    // fields
    public long employeeId;
    public String employeeName;
    public String employeeAddress;
    public Long employeePhone;
    public double basicSalary;
    public double specialAllowance = 250.80d;
    public double hra = 1000.50d;

    // constructors
    public Employee(long employeeId, String employeeName, String employeeAddress, Long employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    // methods
    public double calculateSalary() {
        return basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
    }

    public double calculateTransportAllowance() {
        return .1d * basicSalary;
    }
}
