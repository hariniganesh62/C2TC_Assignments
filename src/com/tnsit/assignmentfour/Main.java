package com.tnsit.assignmentfour;

import java.util.Scanner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double cost = sc.nextDouble();
        
        Airfare airfare = null;
        
        if(choice == 1) {
            airfare = new AirIndia(hours, cost);
        } else if(choice == 2) {
            airfare = new KingFisher(hours, cost);
        } else if(choice == 3) {
            airfare = new Indigo(hours, cost);
        }
        
        airfare.display();
    }
}
