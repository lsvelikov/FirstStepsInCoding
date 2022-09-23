package com.company;

import java.util.Scanner;

public class Architect {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectNumber = Integer.parseInt(scanner.nextLine());

        int hoursToComplete = projectNumber * 3;
        System.out.println("The architect " + name + " will need " + hoursToComplete + " hours to complete " + projectNumber + " project/s.");
    }
}
