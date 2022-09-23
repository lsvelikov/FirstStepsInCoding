package MoreExercises;

import java.util.Scanner;

public class TrainingLab_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double seatsInRow = Math.floor((width - 1) / 0.7);
        double rowsInRoom = Math.floor(length / 1.2);

        double totalSeats = seatsInRow * rowsInRoom - 3;
        System.out.printf("%.0f", totalSeats);

    }
}
