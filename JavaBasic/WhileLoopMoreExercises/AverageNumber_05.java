package WhileLoopMoreExercises;

import java.util.Scanner;

public class AverageNumber_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        for (int i = 1; i <= number; i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNumber;
        }
        System.out.printf("%.2f",sum / number);
    }
}
