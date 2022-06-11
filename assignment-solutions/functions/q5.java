import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double n1 = in.nextDouble();
        System.out.print("Enter the second number: ");
        double n2 = in.nextDouble();

        double ans = product(n1, n2);
        System.out.println("The product of two numbers is " + ans);
    }

    static double product(double n1, double n2) {
        double product = n1 * n2;
        return product;
    }
}
