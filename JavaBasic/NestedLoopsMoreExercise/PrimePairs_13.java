package NestedLoopsMoreExercise;

import java.util.Scanner;

public class PrimePairs_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int diffFirst = Integer.parseInt(scanner.nextLine());
        int diffSecond = Integer.parseInt(scanner.nextLine());
        int firstEnd = first + diffFirst;
        int secondEnd = second + diffSecond;

        for (int i = first; i <= firstEnd; i++) {
            for (int j = second; j <= secondEnd; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.printf("%d%d%n", i, j);
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
