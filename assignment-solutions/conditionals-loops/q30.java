package com.sourav;

import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        double price = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountInPercentage = sc.nextDouble();

        double discount = (discountInPercentage * price) / 100;
        System.out.println("The discount on your product is " + discount);
        double res = price - discount;
        System.out.println("The price of the product after discount is " + res);
    }
}
