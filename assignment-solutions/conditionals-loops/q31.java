package com.sourav;

import java.util.Scanner;

public class q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first point: ");
        double first = sc.nextDouble();
        System.out.print("Enter the second point: ");
        double second = sc.nextDouble();
        double distance = 0;

        if (first > second) {
            distance = first - second;
        }
        else if (second > first) {
            distance = second - first;
        } else if (second == first) {
            distance = 0;
        }

        System.out.println("The distance between first point and second point is " + distance);
    }
}
