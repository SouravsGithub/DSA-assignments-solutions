import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the first diagonal of the rhombus: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter the value of the second diagonal of the rhombus: ");
        double d2 = sc.nextDouble();
        double area = (d1 * d2) / 2;
        System.out.println("The area of the rhombus is " + area);
    }
}
