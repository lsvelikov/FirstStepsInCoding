package MoreExercise_02;

import java.util.Scanner;

public class PipesInPool_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double capacityP1 = p1 * h;
        double capacityP2 = p2 * h;
        double totalCapacity = capacityP1 + capacityP2;

        double totalPercent = (totalCapacity / v) * 100;
        double percentPipe1 = (capacityP1 / totalCapacity) * 100;
        double percentPipe2 = (capacityP2 / totalCapacity) * 100;

        if (totalCapacity <= v){
            System.out.printf("The pool is %.2f full. Pipe 1: %.2f. Pipe 2: %.2f.", totalPercent, percentPipe1, percentPipe2);
        }else{
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, totalCapacity - v);
        }
    }
}
