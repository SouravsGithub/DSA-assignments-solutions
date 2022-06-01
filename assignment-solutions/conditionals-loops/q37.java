import java.util.Scanner;

public class q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial principal balance: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter the number of times interest applied per year: ");
        double n = sc.nextDouble();
        System.out.print("Enter the number of years elapsed: ");
        double t = sc.nextDouble();

        double A = p * Math.pow((1 + (r / n)), (n * t));

        System.out.println("The compound interest is " + A);
    }
}
