package WhileLoopMoreExercises;

import java.util.Scanner;

public class ReportSystem_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumNeeded = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double sumCash = 0;
        double sumCard = 0;
        int transactionCounter = 0;
        int cashTransactionCounter = 0;
        int cardTransactionCounter = 0;
        boolean failedSum = true;

        while (!command.equals("End")){
            int currentSum = Integer.parseInt(command);
            transactionCounter++;
            if ((transactionCounter % 2 != 0) && (currentSum <= 100)){
                System.out.println("Product sold!");
                cashTransactionCounter++;
                sumCash = sumCash + currentSum;
            }else if ((transactionCounter % 2 == 0) && (currentSum > 10)){
                System.out.println("Product sold!");
                cardTransactionCounter++;
                sumCard = sumCard + currentSum;
            }else{
                System.out.println("Error in transaction!");
            }
            double totalSum = sumCash + sumCard;
            if (totalSum >= sumNeeded){
                failedSum = false;
                break;
            }

            command = scanner.nextLine();
        }
        if (failedSum){
            System.out.println("Failed to collect required money for charity.");
        }else{
            System.out.printf("Average CS: %.2f%n", sumCash / cashTransactionCounter);
            System.out.printf("Average CC: %.2f", sumCard / cardTransactionCounter);
        }
    }
}
