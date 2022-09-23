package NestedLoopsMoreExercise;

import java.util.Scanner;

public class SafePasswordsGenerator_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPass = Integer.parseInt(scanner.nextLine());
        boolean enoughPass = false;
        boolean isEqual = false;

        int passCount = 0;
        for (char i = 35; i <= 55; i++) {
            for (char j = 64; j <= 96; j++) {
                for (int k = 1; k <= a; k++) {
                    for (int l = 1; l <= b; l++) {
                        for (char m = 64; m <= 96; m++) {
                            for (char n = 35; n <= 55; n++) {
                                if (i == n && j == m) {
                                    System.out.printf("%c%c%d%d%c%c|", i, j, k, l, m, n);
                                    passCount++;
                                    i++;
                                    j++;
                                    m++;
                                    n++;
                                    if (k == a && l == b){
                                        isEqual = true;
                                        break;
                                    }
                                }
                                if (passCount >= maxPass) {
                                    enoughPass = true;
                                    break;
                                }
                                if (isEqual){
                                    break;
                                }
                            }
                            if (enoughPass){
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
