import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the base: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the base: ");
        double width = sc.nextDouble();
        System.out.print("Enter teh height of the prism: ");
        double height = sc.nextDouble();

        double volume = length * width * height;
        System.out.println("The volume of the prism is " + volume);
    }
}
