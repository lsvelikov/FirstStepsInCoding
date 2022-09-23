package NestedLoopsExe;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++){
            int currentNumber = i;

            int sumEven = 0;
            int sumOdd = 0;
            for (int j = 6; j >= 1; j--){
                int digit = currentNumber % 10;

                if (j % 2 == 0){
                    sumEven = sumEven + digit;
                }else{
                    sumOdd = sumOdd + digit;
                }
                currentNumber = currentNumber / 10;
            }
            if (sumEven == sumOdd){
                System.out.print(i + " ");
            }
        }
    }
}
