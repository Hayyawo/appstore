package com.company;

public class Employee {
    public int numberOfEmployees = 0;
    public String firstName;
    public Double salary;
    public String lastName;
    public Boolean frontEnd;
    public Boolean backEnd;
    public Boolean mobileApps;
    public Boolean wordpress;
    public Boolean prestashop;
    public Boolean dataBase;

    public Employee(int numberOfEmployees, String firstName, Double salary, String lastName, Boolean frontEnd,
                    Boolean backEnd, Boolean mobileApps, Boolean wordpress, Boolean prestashop, Boolean dataBase) {
        this.numberOfEmployees = numberOfEmployees;
        this.firstName = firstName;
        this.salary = salary;
        this.lastName = lastName;
        this.frontEnd = frontEnd;
        this.backEnd = backEnd;
        this.mobileApps = mobileApps;
        this.wordpress = wordpress;
        this.prestashop = prestashop;
        this.dataBase = dataBase;
    }


}
