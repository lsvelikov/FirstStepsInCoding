package WhileLoopLab;

import java.util.Scanner;

public class Graduation_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int badGradeCounter = 0;
        int yearOfStudy = 1;
        double result = 0;
        boolean excluded = false;
        while (yearOfStudy <= 12) {
            if (badGradeCounter == 2) {
                excluded = true;
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4){
                badGradeCounter++;
                continue;
            }
            result = result + currentGrade;
            yearOfStudy++;
        }
        if (excluded){
            System.out.printf("%s has been excluded at %d grade", name, yearOfStudy);
        }else{
            System.out.printf("%s graduated. Average grade: %.2f", name, result / (yearOfStudy - 1));
        }
    }
}
