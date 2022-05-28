import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float principal = sc.nextFloat();
        System.out.print("Enter the time: ");
        float time = sc.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float rate = sc.nextFloat();

        float interest = (principal * time * rate) / 100;
        System.out.println("The interest is " + interest);
    }
}
