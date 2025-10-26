package com.tnsif.assignmenttwo;


public class Main {
    public static void main(String[] args) {
        // Commission example
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();

        // Student example
        Student student = new Student();
        student.acceptDetails();
        student.calculateGrade();
    }
}

