package NestedLoopsMoreExercise;

import java.util.Scanner;

public class TheSongOfTheWheels_12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String pass = "";
        boolean isFound = false;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i * j + k * l == number){
                            if (i < j && k > l){
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                                counter++;
                                if (counter == 4){
                                    pass = "" + i + j + k + l;
                                    isFound = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if (isFound) {
            System.out.println("Password: " + pass);
        }else{
            System.out.println("No!");
        }
    }
}
