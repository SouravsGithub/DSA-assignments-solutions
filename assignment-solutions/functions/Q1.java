import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Give us three numbers to check which one is largest and which one is smallest.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();
        System.out.print("Enter the third number: ");
        int third = in.nextInt();

        int large = largest(first, second, third);
        int small = smallest(first, second, third);
        System.out.println("The largest of the given three numbers is: " + large);
        System.out.println("The smallest of the given three numbers is: " + small);
    }

    static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }

    // function to check the largest among three numbers
    static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }
}