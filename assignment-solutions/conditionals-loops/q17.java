import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();

        double volume = (4 * 3.14 * radius * radius * radius) / 3;
        System.out.println("The volume of the sphere is " + volume);
    }
}
