import java.util.Scanner;

public class q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int temp;

        while (b > 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("HCF is " + a);
    }
}
