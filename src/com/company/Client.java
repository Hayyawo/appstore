package com.company;

public class Client {
    public String firstName;
    public String secondName;
    public String company;
    public String delayOfPayment;
    public String punishmentForDelay;
    public String unWorkingProject;

    public Client(String firstName, String secondName,
                  String company, String delayOfPayment,
                  String punishmentForDelay, String unWorkingProject) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.company = company;
        this.delayOfPayment = delayOfPayment;
        this.punishmentForDelay = punishmentForDelay;
        this.unWorkingProject = unWorkingProject;
    }
}
