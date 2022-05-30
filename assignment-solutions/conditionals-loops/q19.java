import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the base of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter teh height of the cylinder: ");
        double height = sc.nextDouble();

        double curvedSurfaceArea = 2 * 3.14 * radius * height;
        System.out.println("The curved surface area of the cylinder is " + curvedSurfaceArea);
    }
}
