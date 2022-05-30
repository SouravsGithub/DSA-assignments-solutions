import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of the square: ");
        double length = sc.nextDouble();
        double perimeter = 4 * length;
        System.out.println("Perimeter of the square is " + perimeter);
    }
}
