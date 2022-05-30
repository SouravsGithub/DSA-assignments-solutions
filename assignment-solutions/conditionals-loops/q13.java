import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of the rhombus: ");
        double length = sc.nextDouble();
        double perimeter = 4 * length;
        System.out.println("Perimeter of the rhombus is " + perimeter);
    }
}
