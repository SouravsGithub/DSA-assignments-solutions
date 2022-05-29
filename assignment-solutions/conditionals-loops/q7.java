import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of teh side: ");
        double side = sc.nextDouble();
        double area = Math.sqrt(3) / 4 * side * side;
        System.out.println("The area of the equilateral triangle is " + area);
    }
}
