package MoreExercise_02;

import java.util.Scanner;

public class Pets_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFoodInKilograms = Integer.parseInt(scanner.nextLine());
        double dogsFoodPerDayInKg = Double.parseDouble(scanner.nextLine());
        double catsFoodPerDayInKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDayInGrams = Double.parseDouble(scanner.nextLine());

        double dogsFood = days * dogsFoodPerDayInKg;
        double catsFood = days * catsFoodPerDayInKg;
        double turtleFoodInKg = days * turtleFoodPerDayInGrams / 1000;
        double allFood = dogsFood + catsFood + turtleFoodInKg;

        if (leftFoodInKilograms >= allFood){
            System.out.printf("%.0f kilos of food left.", Math.floor(leftFoodInKilograms - allFood));
        }else{
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(allFood - leftFoodInKilograms));
        }
    }
}
