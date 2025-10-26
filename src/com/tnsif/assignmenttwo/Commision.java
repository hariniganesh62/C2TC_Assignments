package com.tnsif.assignmenttwo;
import java.util.Scanner;
class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    public void calculateCommission() {
        double commission;
        double bonus = 0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.12;
            bonus = 2000;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.07;
            bonus = 1000;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.04;
        } else {
            commission = salesAmount * 0.02;
        }

        System.out.println("\nEmployee: " + name);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
        if (bonus > 0) {
            System.out.println("Bonus: " + bonus);
            System.out.println("Total Earnings: " + (commission + bonus));
        }
    }
}
