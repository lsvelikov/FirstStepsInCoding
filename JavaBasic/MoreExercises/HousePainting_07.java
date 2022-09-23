package MoreExercises;

import java.util.Scanner;

public class HousePainting_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double frontWall = (x * x) - (1.2 * 2);
        double backWall = x * x;
        double sideWalls = 2 * ((x * y) - (1.5 * 1.5));

        double roofSides = 2 * (x * y);
        double frontBackRoof = 2 * ((x * h) / 2);

        double houseArea = frontWall + backWall + sideWalls;
        double roofArea = roofSides + frontBackRoof;

        double greenPaint = houseArea / 3.4;
        double redPaint = roofArea / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
