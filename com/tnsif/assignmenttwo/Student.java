package com.tnsif.assignmenttwo;

import java.util.Scanner;

class Student {
    private String name;
    private String rollNumber;
    private int marks;

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    public void calculateGrade() {
        String grade;

        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("\nStudent: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
