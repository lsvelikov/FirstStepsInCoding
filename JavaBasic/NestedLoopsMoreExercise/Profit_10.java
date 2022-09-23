package NestedLoopsMoreExercise;

import java.util.Scanner;

public class Profit_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coins1 = Integer.parseInt(scanner.nextLine());
        int coins2 = Integer.parseInt(scanner.nextLine());
        int coins5 = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= coins1; i++) {
            for (int j = 0; j <= coins2; j++) {
                for (int k = 0; k <= coins5; k++) {
                    if (i * 1 + j * 2 + k * 5 == sum){
                        System.out.printf("%s * 1 lv. + %s * 2 lv. + %s * 5 lv. = %s lv.%n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
