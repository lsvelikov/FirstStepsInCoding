package WhileLoopExercise;

import java.util.Scanner;

public class Vacation_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int spendingMoneyCounter = 0;
        int days = 0;
        boolean failed = false;
        while (ownedMoney < vacationMoney){
            days++;
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (command){
                case "spend":
                    spendingMoneyCounter++;
                    ownedMoney -= money;
                    if (ownedMoney < 0){
                        ownedMoney = 0;
                    }
                    break;
                case "save":
                    spendingMoneyCounter = 0;
                    ownedMoney += money;
                    break;
            }
            if (spendingMoneyCounter == 5){
                failed = true;
                break;
            }
        }
        if (failed){
            System.out.printf("You can't save the money.%n");
            System.out.println(days);
        }else{
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
