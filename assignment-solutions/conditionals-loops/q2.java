import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the height: ");
        double height = sc.nextDouble();
        System.out.print("Enter the value of the base: ");
        double base = sc.nextDouble();
        double area = (height * base) / 2;
        System.out.println("The area of the triangle is " + area);
    }
}
