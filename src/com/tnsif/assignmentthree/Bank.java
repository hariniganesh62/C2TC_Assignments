package com.tnsif.assignmentthree;

	public class Bank {
	    private static int accountCount = 0;

	    public static void incrementAccountCount() {
	        accountCount++;
	    }

	    public static int getTotalAccounts() {
	        return accountCount;
	    }
	}

