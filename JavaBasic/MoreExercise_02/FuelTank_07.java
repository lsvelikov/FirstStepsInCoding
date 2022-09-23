package MoreExercise_02;

import java.util.Scanner;

public class FuelTank_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFuel = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());

        if (typeFuel.equals("Diesel") || typeFuel.equals("Gasoline") || typeFuel.equals("Gas")){
            if (liters >= 25){
                System.out.printf("You have enough %s.", typeFuel.toLowerCase());
            }else{
                System.out.printf("Fill your tank with %s!", typeFuel.toLowerCase());
            }
        }else{
            System.out.println("Invalid fuel!");
        }
    }
}
