package com.company;

import java.util.Scanner;

public class New {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double price = 0;
        double profit = 0;
        boolean isEnough = false;
        while (!input.equals("closed")){
            String type = input;
            String command = scanner.nextLine();

            switch (type){
                case "haircut":
                    if (command.equals("mens")){
                        price = 15;
                    }else if (command.equals("ladies")){
                        price = 20;
                    }else if (command.equals("kids")){
                        price = 10;
                    }
                    break;
                case "color":
                    if (command.equals("touch up")){
                        price = 20;
                    }else if (command.equals("full color")){
                        price = 30;
                    }
                    break;
            }

            profit += price;
            if (profit >= target){
                isEnough = true;
                break;
            }

            input = scanner.nextLine();
        }
        if (isEnough) {
            System.out.println("You have reached your target for the day!");
        }else{
            System.out.printf("Target not reached! You need %.0flv. more.%n", Math.abs(profit - target));
        }
        System.out.printf("Earned money: %.0flv.", profit);
    }
}
