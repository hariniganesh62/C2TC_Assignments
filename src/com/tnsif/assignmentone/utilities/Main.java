package com.tnsif.assignmentone.utilities;


import com.tnsif.assignmentone.employee.Developer;
import com.tnsif.assignmentone.employee.Manager;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Harini", 101, 55000, "AI Chatbot");
        Manager mgr = new Manager("Kaviya", 102, 70000, 5);

        System.out.println("Developer Details:");
        dev.displayInfo();

        System.out.println("\nManager Details:");
        mgr.displayInfo();
    }
}

