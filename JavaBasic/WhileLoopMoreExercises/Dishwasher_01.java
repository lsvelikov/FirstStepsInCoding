package WhileLoopMoreExercises;

import java.util.Scanner;

public class Dishwasher_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergentBottles = Integer.parseInt(scanner.nextLine());
        int totalDetergentInMl = detergentBottles * 750;

        String command = scanner.nextLine();
        int plates = 0;
        int pots = 0;
        int washingCount = 0;
        boolean notEnough = false;

        while (!command.equals("End")){
            int dishes = Integer.parseInt(command);
            washingCount++;

            if (washingCount % 3 == 0){
                totalDetergentInMl = totalDetergentInMl - (dishes * 15);
                pots = pots + dishes;
            }else{
                totalDetergentInMl = totalDetergentInMl - (dishes * 5);
                plates = plates + dishes;
            }
            if (totalDetergentInMl < 0){
                notEnough = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (notEnough){
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(totalDetergentInMl));
        }else{
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", plates, pots);
            System.out.printf("Leftover detergent %d ml.", totalDetergentInMl);
        }
    }
}
