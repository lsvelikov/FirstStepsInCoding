package MoreExercises;

import java.util.Scanner;

public class VegetableMarket_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        double vegKilograms = Double.parseDouble(scanner.nextLine());
        double fruitKilograms = Double.parseDouble(scanner.nextLine());

        double profit = (vegPrice * vegKilograms) + (fruitPrice * fruitKilograms);
        double profitInEuro = profit / 1.94;
        System.out.printf("%.2f", profitInEuro);

    }
}
