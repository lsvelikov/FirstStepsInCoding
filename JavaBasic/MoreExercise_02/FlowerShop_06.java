package MoreExercise_02;

import java.util.Scanner;

public class FlowerShop_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnoliasCount = Integer.parseInt(scanner.nextLine());
        int hyacinthsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int cactusCount = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = (magnoliasCount * 3.25) + (hyacinthsCount * 4) + (rosesCount * 3.5) + (cactusCount * 8);
        double tax = totalPrice * 0.05;
        double profit = totalPrice - tax;

        if (profit >= presentPrice){
            System.out.printf("She is left with %.0f leva.", Math.floor(profit - presentPrice));
        }else{
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(presentPrice - profit));
        }
    }
}
