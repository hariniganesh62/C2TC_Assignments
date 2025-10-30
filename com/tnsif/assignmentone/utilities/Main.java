package com.tnsif.assignmentone.utilities;

<<<<<<< HEAD

import com.tnsif.assignmentone.employee.Developer;
import com.tnsif.assignmentone.employee.Manager;
=======
import com.tnsif.assignmentone.employees.Developer;
import com.tnsif.assignmentone.employees.Manager;
>>>>>>> af19091e2cb9deb0dffa0696936eb5f24ecdcc1d

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

