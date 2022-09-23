package MoreExercise_02;

import java.util.Scanner;

public class Harvest_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grapesProduction = x * y;
        double grapesForWine = (0.4 * grapesProduction) / 2.5;

        if (grapesForWine >= z){
            double wineOver = Math.ceil(grapesForWine - z);
            double wineProWorker = Math.ceil(wineOver / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n" +
                    "%.0f liters left -> %.0f liters per person.\n", grapesForWine, wineOver, wineProWorker);
        }else{
            double litersNeeded = Math.floor(z - grapesForWine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", litersNeeded);
        }
    }
}
