import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of the cube: ");
        double side = sc.nextDouble();

        double totalSurfaceArea = 6 * side * side;
        System.out.println("Total surface area of the cube is " + totalSurfaceArea);
    }
}
