package WhileLoopExercise;

import java.util.Scanner;

public class Cake_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bright = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int totalPieces = bright * length;

        boolean cakeIsOver = false;
        while (!command.equals("STOP")){
            int pieces = Integer.parseInt(command);

            totalPieces = totalPieces - pieces;

            if (totalPieces < 0){
                cakeIsOver = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (cakeIsOver){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        }else{
            System.out.printf("%d pieces are left.", totalPieces);
        }
    }
}
