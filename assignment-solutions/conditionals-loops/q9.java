import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the side of the triangle: ");
        double side = sc.nextDouble();
        double perimeter = 3 * side;
        System.out.println("The perimeter of this equilateral triangle is " + perimeter);
    }
}
