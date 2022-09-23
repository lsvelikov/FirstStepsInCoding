package WhileLoopLab;

import java.util.Scanner;

public class Password_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();

        while (!pass.equals(pass)){
            pass = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);
    }
}
