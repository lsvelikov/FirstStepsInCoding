package NestedLoopsMoreExercise;

import java.util.Scanner;

public class PasswordGenerator_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int counterFirstChar = 0;
                for (char k = 97; k <= 122; k++) {
                    int counterSecondChar = 0;
                    for (char m = 97; m <= 122; m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                            }
                        }
                        counterSecondChar++;
                        if (counterSecondChar >= l) {
                            break;
                        }
                    }
                    counterFirstChar++;
                    if (counterFirstChar >= l) {
                        break;
                    }
                }
            }
        }
    }
}
