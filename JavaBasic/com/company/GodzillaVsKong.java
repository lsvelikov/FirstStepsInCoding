package com.company;

import java.util.Scanner;

public class GodzillaVsKong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        double countSupernumerary = Double.parseDouble(scanner.nextLine());
        double suitSupernumerary = Double.parseDouble(scanner.nextLine());

        double decorPrice = filmBudget * 0.1;
        double suitPrice = suitSupernumerary * countSupernumerary;
        double endBudget = decorPrice + suitPrice;

        if (filmBudget > endBudget){
            double moneyLeft = filmBudget - endBudget;
            System.out.printf("Action! %n Wingard starts filming with %.2f leva left.", moneyLeft);

        }else{
            double moneyLeft = endBudget - filmBudget;
            System.out.printf("Not enough money! Wingard needs %.2f leva more.", moneyLeft);
        }
    }
}
