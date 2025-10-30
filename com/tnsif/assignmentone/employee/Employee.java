package com.tnsif.assignmentone.employee;

public class Employee {


	    private String name;
	    private int employeeId;
	    private double salary;

	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary: " + salary);
	    }
	}




