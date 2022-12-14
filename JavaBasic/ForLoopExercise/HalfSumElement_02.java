package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber > max) {
                max = currentNumber;
            }
            sum += currentNumber;

        }
        sum -= max;
        if (sum == max){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        }else{
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - max));
        }
    }
}
