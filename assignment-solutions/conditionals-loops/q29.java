package com.sourav;

import java.util.Scanner;

public class q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextInt();
        double sum = 0;
        double count = 0;
        double res;
        while (num != 0) {
            sum = sum + num;
            count++;
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }
        res = sum / count;
        System.out.println("The average of the numbers you entered is " + res);
    }
}
