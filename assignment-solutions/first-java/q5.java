import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = sc.nextFloat();

        if (num1 > num2) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number.");
        } else  {
            System.out.println("Both are equal.");
        }
    }
}
