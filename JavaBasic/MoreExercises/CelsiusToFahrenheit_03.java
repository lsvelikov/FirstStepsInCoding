package MoreExercises;

import java.util.Scanner;

public class CelsiusToFahrenheit_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradCelsius = Double.parseDouble(scanner.nextLine());
        double gradFahrenheit = gradCelsius * 1.8 + 32;
        System.out.printf("%.2f", gradFahrenheit);
    }
}
