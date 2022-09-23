package NestedLoopsLab;

import java.util.Scanner;

public class Travelling_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String destination = input;
            double budget = Double.parseDouble(scanner.nextLine());

            double totalMoney = 0;
            while (totalMoney < budget){
                double currentMoney = Double.parseDouble(scanner.nextLine());
                totalMoney = totalMoney + currentMoney;
                if (totalMoney >= budget){
                    break;
                }

            }
            System.out.printf("Going to %s!%n", destination);
            input = scanner.nextLine();
        }
    }
}
