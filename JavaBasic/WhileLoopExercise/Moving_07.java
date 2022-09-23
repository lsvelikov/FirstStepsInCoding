package WhileLoopExercise;

import java.util.Scanner;

public class Moving_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int bright = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int totalSpace = width * bright * length;

        String command = scanner.nextLine();

        boolean outOfSpace = false;
        while (!command.equals("Done")){
            int boxes = Integer.parseInt(command);

            totalSpace = totalSpace - boxes;

            if (totalSpace < 0){
                outOfSpace = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (outOfSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalSpace));
        }else{
            System.out.printf("%d Cubic meters left.", totalSpace);
        }
    }
}
