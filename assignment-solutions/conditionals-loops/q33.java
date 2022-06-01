import java.util.Scanner;

public class q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = sc.nextDouble();
        double temp = num;
        System.out.print("Enter the power: ");
        double power = sc.nextDouble();
        for (int i = 1; i < power; i++) {
            num = num * temp;
        }
        System.out.println(num);
    }
}
