package WhileLoopMoreExercises;

import java.util.Scanner;

public class StreamOfLetters_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String word = "";
//        String specialWord = "";
        int counterC = 0;
        int counterO = 0;
        int counterN = 0;


        while (!command.equals("End")) {
            String letter = command;

            for (int i = 0; i < letter.length(); i++) {
                boolean flag = Character.isAlphabetic(letter.charAt(i));
                if (flag){
                    switch (letter){
                        case "c":
//                            specialWord = specialWord + letter;
                            if (counterC >= 1){
                                word = word + letter;
                            }
                            counterC++;
                            break;
                        case "o":
//                            specialWord = specialWord + letter;
                            if (counterO >= 1){
                                word = word + letter;
                            }
                            counterO++;
                            break;
                        case "n":
//                            specialWord = specialWord + letter;
                            if (counterN >= 1){
                                word = word + letter;
                            }
                            counterN++;
                            break;
                        default:
                            word = word + letter;
                            break;
                    }
                }
            }


            if (counterC >= 1 && counterO >= 1 && counterN >= 1) {
                System.out.printf("%s ", word);
                word = "";
                counterC = 0;
                counterO = 0;
                counterN = 0;
            }
            command = scanner.nextLine();
        }
    }
}
