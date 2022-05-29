import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the isosceles triangle's side: ");
        double side = sc.nextDouble();
        double area = (side * side) / 2;
        System.out.print("The area of the isosceles triangle is " + area);
    }
}
