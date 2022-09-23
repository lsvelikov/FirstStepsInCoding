package NestedLoopsMoreExercise;

import java.util.Scanner;

public class LettersCombinations_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().charAt(0);
        char secondLetter = scanner.nextLine().charAt(0);
        char thirdLetter = scanner.nextLine().charAt(0);

        int count = 0;
        for (char i = firstLetter; i <= secondLetter; i++){
            for (char j = firstLetter; j <= secondLetter; j++){
                for (char k = firstLetter; k <= secondLetter; k++){
                    if (i == thirdLetter || j == thirdLetter || k == thirdLetter){
                        continue;
                    }else{
                        System.out.printf("%c%c%c ", i, j, k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
