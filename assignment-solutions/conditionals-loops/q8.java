import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of teh circle: ");
        double radius = sc.nextDouble();
        double perimeter = 2 * 3.14f + radius;
        System.out.println("The perimeter of the circle is " + perimeter);
    }
}
