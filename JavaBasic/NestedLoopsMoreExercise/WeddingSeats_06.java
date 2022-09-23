package NestedLoopsMoreExercise;

import java.util.Scanner;

public class WeddingSeats_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sector = scanner.nextLine().charAt(0);
        int rows = Integer.parseInt(scanner.nextLine());
        int placesOddRows = Integer.parseInt(scanner.nextLine());
        char firstSector = 'A';
        char firstSeat = 'a';
        char lastSeat = 'z';
        int seatsCount = 0;

        for (char i = firstSector; i <= sector; i++) {

            int rowsCount = 0;
            int placesToPrint;
            for (int j = 1; j <= rows; j++) {
                rowsCount++;
                if (j % 2 == 0){
                    placesToPrint = placesOddRows + 2;
                }else{
                    placesToPrint = placesOddRows;
                }
                int seatsPerRowCount = 0;
                for (char k = firstSeat; k <= lastSeat; k++) {
                    System.out.printf("%c%d%c%n", i, j, k);
                    seatsPerRowCount++;
                    seatsCount++;
                    if (placesToPrint <= seatsPerRowCount){
                        break;
                    }
                }
                if (rowsCount == rows){
                    break;
                }
            }
            rows++;
        }
        System.out.println(seatsCount);
    }
}
