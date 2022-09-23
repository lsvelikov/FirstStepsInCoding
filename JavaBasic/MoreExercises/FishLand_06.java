package MoreExercises;

import java.util.Scanner;

public class FishLand_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double kilogramBeltedBonito = Double.parseDouble(scanner.nextLine());
        double kilogramScad = Double.parseDouble(scanner.nextLine());
        int kilogramMussels = Integer.parseInt(scanner.nextLine());

        double totalBeltedBonitoPrice = kilogramBeltedBonito * (mackerelPrice + (mackerelPrice * 0.6));
        double totalScadPrice = kilogramScad * (spratPrice + (spratPrice * 0.8));
        double totalMusselsPrice = kilogramMussels * 7.5;

        double totalSum = totalBeltedBonitoPrice + totalScadPrice + totalMusselsPrice;
        System.out.printf("%.2f", totalSum);

    }
}
