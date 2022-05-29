import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.print("The area of the rectangle is " + area);
    }
}
