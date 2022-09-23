package com.company;

import java.util.Scanner;

public class Hour {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int hour = Integer.parseInt(scanner.nextLine());
                int minutes = Integer.parseInt(scanner.nextLine());

                int newMinutes = (minutes + 15) % 60;
                int newHour = minutes / 60;

                if ((hour >= 0 && hour <= 23) && (minutes >= 0 && minutes <= 59)){
                    System.out.printf("%d:0%d",newHour,newMinutes);


        }
    }
}
