import java.util.Scanner;

public class q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sale price of the product: ");
        double price = sc.nextDouble();
        System.out.print("Enter the commission on the product: ");
        double commission = sc.nextDouble();

        double commissionPercentage = (commission / price) * 100;
        System.out.println("Your commission percentage is " + commissionPercentage + "%.");
    }
}
