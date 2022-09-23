package com.company;

import java.util.Scanner;

public class SquareStar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < number; row++){
            for (int column = 0; column < number; column++){
                if (row == 0 || row == number - 1 || column == 0 || column == number - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
