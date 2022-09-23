package com.company;

import java.util.Scanner;

public class Reading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1 = scanner.nextInt();
        int player2 = scanner.nextInt();
        int player3 = scanner.nextInt();
        int allSeconds = player1 + player2 + player3;

        int minutes = allSeconds / 60;
        int remainingSeconds = allSeconds % 60;
        if (allSeconds > 60){
            if (remainingSeconds >= 0 && remainingSeconds <= 9){
                System.out.printf("%d:0%d",minutes,remainingSeconds);
            }else{
                System.out.printf("%d:%d",minutes,remainingSeconds);
            }
        }else{
            System.out.printf("%d:%d",minutes,remainingSeconds);
        }
    }
}
