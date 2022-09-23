package NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combination = 0;
        boolean isFound = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combination++;
                int result = i + j;
                if (result == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combination, i, j, result);
                    isFound = true;
                    break;
                }
            }
            if (isFound){
                break;
            }
        }
        if (!isFound){
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }
    }
}
