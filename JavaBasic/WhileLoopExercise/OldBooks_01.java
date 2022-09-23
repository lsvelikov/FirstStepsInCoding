package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();
        String command = scanner.nextLine();

        int bookCounter = 0;
        boolean foundBook = false;
        while (!command.equals("No More Books")){

            if (command.equals(wantedBook)){
                foundBook = true;
                break;
            }
            bookCounter++;
            command = scanner.nextLine();
        }
        if (foundBook){
            System.out.printf("You checked %d books and found it.", bookCounter);
        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCounter);
        }
    }
}
