import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double n1 = in.nextDouble();
        System.out.print("Enter the second number: ");
        double n2 = in.nextDouble();

        double ans = sum(n1, n2);
        System.out.println("The sum of two numbers is " + ans);
    }

    static double sum(double n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }
}
