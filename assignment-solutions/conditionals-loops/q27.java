package com.sourav;

import java.util.Scanner;

public class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get it's factorial: ");
        int num = sc.nextInt();
        int res = 1;
        while (num > 0) {
            res = res * num;
            num--;
        }
        System.out.println("The factorial of " + num + " is " + res);
    }
}
