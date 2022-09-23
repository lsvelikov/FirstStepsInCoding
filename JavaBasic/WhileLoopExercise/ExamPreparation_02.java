package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int badGradeCounter = 0;
        double sum = 0;
        int solvedProblems = 0;
        String lastProblem = "";
        boolean failed = false;
        while (!command.equals("Enough")){
            String currentProblem = command;
            double grade = Integer.parseInt(scanner.nextLine());
            lastProblem = currentProblem;
            solvedProblems++;


            if (grade <= 4){
                badGradeCounter++;
            }
            sum = sum + grade;

            if (badGradeCounter >= maxBadGrades){
                failed = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (failed){
            System.out.printf("You need a break, %d poor grades.", badGradeCounter);
        }else{
            System.out.printf("Average score: %.2f%n", sum * 1.0 / solvedProblems);
            System.out.printf("Number of problems: %d%n", solvedProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
