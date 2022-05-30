import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the base: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the base: ");
        double width = sc.nextDouble();
        System.out.print("Enter teh height of the pyramid: ");
        double height = sc.nextDouble();

        double volume = (length * width * height) / 3;
        System.out.println("The volume of the pyramid is " + volume);
    }
}
