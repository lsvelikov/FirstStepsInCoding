package NestedLoopsExe;

import java.util.Scanner;

public class TrainTheTrainers_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judge = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double totalAssessment = 0;
        int assessmentCount = 0;

        while (!input.equals("Finish")){
            String presentation = input;

            double presentationAssessment = 0;
            for (int i = 1; i <= judge; i++){
                double assessment = Double.parseDouble(scanner.nextLine());
                assessmentCount++;
                presentationAssessment = presentationAssessment + assessment;
            }
            totalAssessment = totalAssessment + presentationAssessment;

            System.out.printf("%s - %.2f.%n", presentation, presentationAssessment / judge);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalAssessment / assessmentCount);
    }
}
