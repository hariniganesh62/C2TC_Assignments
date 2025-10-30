package com.tnsif.assignmentfive;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] data = input.split(",");

        TicketBooking booking = new TicketBooking(data[0], data[1], Integer.parseInt(data[2]));

        int choice = sc.nextInt();
        sc.nextLine();

        booking.display();

        switch(choice) {
            case 1:
                double cashAmt = sc.nextDouble();
                booking.makePayment(cashAmt);
                break;

            case 2:
                double walletAmt = sc.nextDouble();
                sc.nextLine();
                String walletNo = sc.nextLine();
                booking.makePayment(walletAmt, walletNo);
                break;

            case 3:
                String holderName = sc.nextLine();
                double cardAmt = sc.nextDouble();
                sc.nextLine();
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, cardAmt, cardType, ccv);
                break;

            default:
                System.out.print("Invalid choice");
        }
    }
}
