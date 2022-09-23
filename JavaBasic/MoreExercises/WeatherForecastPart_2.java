package MoreExercises;

import java.util.Scanner;

public class WeatherForecastPart_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grad = Double.parseDouble(scanner.nextLine());

        if (grad >= 5 && grad <= 11.9){
            System.out.println("Cold");
        }else if (grad <= 14.9){
            System.out.println("Cool");
        }else if (grad <= 20.00){
            System.out.println("Mild");
        }else if (grad <= 25.9){
            System.out.println("Warm");
        }else if (grad <= 35.00){
            System.out.println("Hot");
        }else{
            System.out.println("unknown");
        }
    }
}
