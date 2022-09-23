package com.company;

import java.util.Scanner;

public class Yard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m2 = Integer.parseInt(scanner.nextLine());

        double discount = m2 * 7.61 * 0.18;
        double finalPrice = (m2 * 7.61) - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}
