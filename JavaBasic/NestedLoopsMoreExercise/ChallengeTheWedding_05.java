package NestedLoopsMoreExercise;

import java.util.Scanner;

public class ChallengeTheWedding_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mens = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean notEnoughTable = false;

        for (int i = 1; i <= mens; i++) {
            for (int j = 1; j <= women; j++) {
                System.out.printf("(%d <-> %d) ", i, j);
                count++;
                if (count >= tables) {
                    notEnoughTable = true;
                    break;
                }
            }
            if (notEnoughTable) {
                break;
            }
        }
    }
}

