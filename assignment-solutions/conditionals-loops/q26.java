import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("ENter teh second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        System.out.println("The addition of both numbers is " + sum);
    }
}
