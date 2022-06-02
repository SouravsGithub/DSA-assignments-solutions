import java.util.Scanner;

public class q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int lcm;

        lcm = Math.max(a, b);

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("THe LCM is " + lcm);
                break;
            }
            ++lcm;
        }
    }
}
