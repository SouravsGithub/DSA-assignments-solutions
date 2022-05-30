import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the base circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter teh height of the cylinder: ");
        double height = sc.nextDouble();

        double volume = 3.14 * radius * radius * height;
        System.out.println("The volume of the cylinder is " + volume);
    }
}
