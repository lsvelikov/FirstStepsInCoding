package MoreExercise_02;

import java.util.Scanner;

public class TransportPrice_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();

        double price = 0;
        if (kilometers < 20){
            if (partOfTheDay.equals("day")){
                price = 0.70 + kilometers * 0.79;
                System.out.printf("%.2f", price);
            }else if (partOfTheDay.equals("night")){
                price = 0.70 + kilometers * 0.90;
                System.out.printf("%.2f", price);
            }
        }else if (kilometers < 100){
            price = kilometers * 0.09;
            System.out.printf("%.2f", price);
        }else{
            price = kilometers * 0.06;
            System.out.printf("%.2f", price);
        }
    }
}
