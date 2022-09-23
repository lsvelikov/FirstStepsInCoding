package com.company;

import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        int area = a * a;
        System.out.println("Square area = " + area);
    }
}
