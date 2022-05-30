import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        int rem;
        while (num > 0) {
            rem = num % 10;
            product = product * rem;
            sum = sum + rem;
            num = num / 10;
        }
        int res = product - sum;
        System.out.println("Product - sum = " + res);
    }
}
