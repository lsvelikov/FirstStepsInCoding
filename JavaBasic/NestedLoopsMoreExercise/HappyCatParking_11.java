package NestedLoopsMoreExercise;

import java.util.Scanner;

public class HappyCatParking_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double finalPrice = 0;

        for (int i = 1; i <= days; i++) {
            double totalPrice = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0){
                    price = 2.50;
                    totalPrice += price;
                }else if (i % 2 != 0 && j % 2 == 0){
                    price = 1.25;
                    totalPrice += price;
                }else{
                    price = 1;
                    totalPrice += price;
                }
                finalPrice += price;
            }
            System.out.printf("Day: %s - %.2f leva%n", i, totalPrice);
        }
        System.out.printf("Total: %.2f leva", finalPrice);
    }
}
