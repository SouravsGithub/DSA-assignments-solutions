import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is even or odd.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        System.out.println(num + " : " + evenOrOdd(num));
    }

    // this will check if the number is odd or even using the LSB
    // the least significant bit of an even number is always 0 and for odd number it's always 1
    static String evenOrOdd(int num) {
        if (num == 0) {
            return "Zero";
        } else if (num < 0) {
            return "Negative";
        } else {
            if (Integer.toBinaryString(num).endsWith("0")) {
                return "even";
            } else {
                return "Odd";
            }
        }
    }
}
