package com.sourav;

import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units to calculate electricity bill: ");
        int units = sc.nextInt();;
        double billToPay = 0;

        if (units < 100) {
            billToPay = units * 1.20;
        }
        else if (units < 300) {
            billToPay = 100 * 1.20 + (units - 100) * 2;
        }
        else if (units > 300) {
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }

        System.out.println("The electricity bill for " + units + " units is " + billToPay);
    }
}
