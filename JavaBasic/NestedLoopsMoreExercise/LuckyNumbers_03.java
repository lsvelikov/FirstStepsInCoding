package NestedLoopsMoreExercise;

import java.util.Scanner;

public class LuckyNumbers_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumFirstTwo = 0;
        int sumSecondTwo = 0;
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                for (int k = 1; k <= 9; k++){
                    for (int l = 1; l <= 9; l++){
                        sumFirstTwo = i + j;
                        sumSecondTwo = k + l;
                        if (sumFirstTwo == sumSecondTwo && number % sumFirstTwo == 0){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
