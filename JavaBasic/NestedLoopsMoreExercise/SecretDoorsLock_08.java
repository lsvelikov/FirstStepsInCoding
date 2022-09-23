package NestedLoopsMoreExercise;

import java.util.Scanner;

public class SecretDoorsLock_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hundreds = Integer.parseInt(scanner.nextLine());
        int tens = Integer.parseInt(scanner.nextLine());
        int ones = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= hundreds; i++) {
            for (int j = 1; j <= tens; j++) {
                for (int k = 1; k <= ones; k++) {
                    if (i % 2 == 0 && isPrime(j) && k % 2 == 0){
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
