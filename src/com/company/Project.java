package com.company;

import java.util.LinkedList;
import java.util.Random;

public class Project {
    public String difficulty;
    public Integer frontEndDays;
    public Integer backEndDays;
    public Integer dataBaseDays;
    public Integer mobileDays;
    public Integer wordpressDays;
    public Integer prestashopDays;
    public Double  projectPrice;

    public Project(String difficulty, Integer frontEndDays, Integer backEndDays, Integer dataBaseDays, Integer mobileDays, Integer wordpressDays, Integer prestashopDays, Double projectPrice) {
        this.difficulty = difficulty;
        this.frontEndDays = frontEndDays;
        this.backEndDays = backEndDays;
        this.dataBaseDays = dataBaseDays;
        this.mobileDays = mobileDays;
        this.wordpressDays = wordpressDays;
        this.prestashopDays = prestashopDays;
        this.projectPrice = projectPrice;
    }

    public Project() {

    }

    public void numberGeneratorEasy() {

        Random r = new Random();


         System.out.println(r.nextInt(11));
    }
    public int numberGeneratorMiddle() {

        Random r = new Random();


        return r.nextInt(11);
    }
    public int numberGeneratorHard() {

        Random r = new Random();


        return r.nextInt(11);
    }
}
