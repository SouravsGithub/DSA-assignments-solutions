import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the first side: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of the second side: ");
        double b = sc.nextDouble();
        double perimeter = 2 * (a + b);
        System.out.println("The perimeter of the Parallelogram is " + perimeter);
    }
}
