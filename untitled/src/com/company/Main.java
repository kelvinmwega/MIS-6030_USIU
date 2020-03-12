package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            assignment2();
            System.exit(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Entry!", "Error!", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void assignment2() {

        double pricePerPound = 5.99;
        double taxRate = 0.0725;

        CoffeeBag coffeeBag = new CoffeeBag(pricePerPound, taxRate);
        coffeeBag.setUnitWeight(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coffee bag unit weight in lb")));
        coffeeBag.setNumberOfBags(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of coffee bags")));
        coffeeBag.calculateTotalPrice();
        JOptionPane.showMessageDialog(null, coffeeBag.createDisplayMessage(), "Coffee Bag Receipt", JOptionPane.PLAIN_MESSAGE);
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


