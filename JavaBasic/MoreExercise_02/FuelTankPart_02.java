package MoreExercise_02;

import java.util.Scanner;

public class FuelTankPart_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double totalPrice = 0;

        if (fuelType.equals("Gas")){
            if (clubCard.equals("Yes")){
                totalPrice = fuel * (0.93 - 0.08);
            }else if (clubCard.equals("No")){
                totalPrice = fuel * 0.93;
            }
        }else if (fuelType.equals("Gasoline")){
            if (clubCard.equals("Yes")){
                totalPrice = fuel * (2.22 - 0.18);
            }else if (clubCard.equals("No")){
                totalPrice = fuel * 2.22;
            }
        }else if (fuelType.equals("Diesel")){
            if (clubCard.equals("Yes")){
                totalPrice = fuel * (2.33 - 0.12);
            }else if (clubCard.equals("No")){
                totalPrice = fuel * 2.33;
            }
        }

        if (fuel >= 20 && fuel <= 25){
            totalPrice = totalPrice - (totalPrice * 0.08);
        }else if (fuel > 25){
            totalPrice = totalPrice - (totalPrice * 0.1);
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
