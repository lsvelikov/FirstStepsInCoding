package MoreExercise_02;

import java.util.Scanner;

public class SleepyTomCat_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double daysOff = Double.parseDouble(scanner.nextLine());

        double minutesToPlay = 30000;
        int daysInYear = 365;
        double workingDays = daysInYear - daysOff;
        double totalPlayMinutes = (workingDays * 63) + (daysOff * 127);


        if (totalPlayMinutes <= minutesToPlay){
            double differenceInMinutes = minutesToPlay - totalPlayMinutes;
            double playHours = Math.floor(differenceInMinutes / 60);
            double playMinutes = differenceInMinutes % 60;
            System.out.printf("Tom sleeps well\n" +
                    "%.0f hours and %.0f minutes less for play\n", playHours, playMinutes);
        }else{
            double differenceInMinutes = totalPlayMinutes - minutesToPlay;
            double playHours = Math.floor(differenceInMinutes / 60);
            double playMinutes = differenceInMinutes % 60;
            System.out.printf("Tom will run away\n" +
                    "%.0f hours and %.0f minutes more for play\n", playHours, playMinutes);
        }
    }
}
