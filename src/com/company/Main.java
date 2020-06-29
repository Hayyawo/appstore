package com.company;

import java.util.Scanner;

public class Main {


    static Scanner in = new Scanner(System.in);


    static void option1() {
        System.out.println("Option 1 chose\n");
    }

    static void option2() {
        System.out.println("Option 2 chose\n");
    }

    static void option3() {
        System.out.println("Option 3 chose\n");
    }

    static void option4() {
        System.out.println("Option 4 chose\n");
    }

    static void option5() {
        System.out.println("Option 5 chose\n");
    }

    static void option6() {
        System.out.println("Option 6 chose\n");
    }

    static void option7() {
        System.out.println("Option 7 chose\n");
    }

    static void option8() {
        System.out.println("Option 8 chose\n");
    }

    static void option9() {
        System.out.println("Option 9 chose\n");
    }

    static void option10() {
        System.out.println("Option 10 chose\n");
    }

    static void showMenu() {
        System.out.print("Options:\n1. Easy project\n2. Mid project \n3. Hard Project\n4. Search for clients\n5. Coding day" +
                "\n6. Tests day\n7. Give your project to client\n8. Hire new employee\n9. Dismiss an employee\n10. Pay zus\n>> ");
    }



    static void menu() {
        Project project = new Project();

        int nrOfOption;
        do {
            showMenu();
            nrOfOption = in.nextInt();
            switch (nrOfOption) {
                case 1:
                    project.numberGeneratorEasy();
                    break;
                case 2:
                    //opcjaDruga();
                    break;
            }
        }
        while (nrOfOption >0 && nrOfOption <10);
    }

    public static void main(String[] args) {
        menu();
    }
}

