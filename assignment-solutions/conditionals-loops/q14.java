import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the radius of teh cone: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the value of the height of the cone: ");
        double height = sc.nextDouble();
        double volume = 3.14 * radius *radius * height / 3;
        System.out.print("The volume of the cone is " + volume);
    }
}
