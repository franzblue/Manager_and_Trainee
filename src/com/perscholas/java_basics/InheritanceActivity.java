package com.perscholas.java_basics;

public class InheritanceActivity {
    public static void newManager() {
        Manager peter = new Manager(126534, "Peter", "CHennai India", 237844l, 65000);
        System.out.println("Peter's calculated salary: " + peter.calculateSalary());
        System.out.println("Peter's transport allowance: " + peter.calculateTransportAllowance());
    }

    public static void newTrainee() {
        Trainee jack = new Trainee(29846, "Jack", "Mumbai India", 442085l, 45000);
        System.out.println("Jack's calculated salary: " + jack.calculateSalary());
        System.out.println("Jack's transport allowance: " + jack.calculateTransportAllowance());
    }
}
