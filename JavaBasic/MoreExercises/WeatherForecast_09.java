package MoreExercises;

import java.util.Scanner;

public class WeatherForecast_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        if (weather.equals("sunny")){
            System.out.printf("It's warm outside!", weather);
        }else{
            System.out.printf("It's cold outside!", weather);
        }
    }
}
