package NestedLoopsExe;

import java.util.Scanner;

public class CinemaTickets_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int totalTicketsCount = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;
        while (!input.equals("Finish")) {
            String movie = input;
            int seats = Integer.parseInt(scanner.nextLine());

            String ticketType = scanner.nextLine();
            int currentTicketCount = 0;
            while (!ticketType.equals("End")) {
                currentTicketCount++;
                totalTicketsCount++;
                if (ticketType.equals("student")){
                    studentCount++;
                }else if (ticketType.equals("standard")){
                    standardCount++;
                }else if (ticketType.equals("kid")){
                    kidCount++;
                }
                if (currentTicketCount >= seats){
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, currentTicketCount * 1.0 / seats * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTicketsCount);
        System.out.printf("%.2f%% student tickets.%n", studentCount * 1.0 / totalTicketsCount * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCount * 1.0 / totalTicketsCount * 100);
        System.out.printf("%.2f%% kids tickets.",kidCount * 1.0 / totalTicketsCount * 100);
    }
}
