package com.tnsif.assignmentone.employee;

	public class Developer extends Employee {
	    private String project;

	    public Developer(String name, int employeeId, double salary, String project) {
	        super(name, employeeId, salary);
	        this.project = project;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Working on Project: " + project);
	    }
	}



