package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            assignment1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void assignment1() {
        System.out.println("!! Donut Area Calculator !!!");

        Scanner scanner = new Scanner(System.in);
        Area areaCalc = new Area();
        boolean run = true;

        while(run){
            System.out.print("Enter Radius of outer circle in cm.. : ");
            areaCalc.radius1 = scanner.nextDouble();
            System.out.print("Enter Radius of inner circle in cm.. : ");
            areaCalc.radius2 = scanner.nextDouble();

            System.out.printf("%s%.2f%s", "The Area of your Donut is = ", areaCalc.donutAreaCalculator(), " cm squared\n");

            System.out.print("Do you wish to rerun the application? (y/n) : ");
            String cont = scanner.next();

            switch (cont){
                case "y":
                    break;
                case "n":
                    run = false;
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("!! Invalid entry !!");
                    break;
            }

        }
    }
}
