import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        System.out.print("Give a triplet to check if it is a Pythagorean triplet or not: ");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();

        if (pythagoreanTriplet(first, second, third)) {
            System.out.println("This is a Pythagorean Triplet.");
        } else {
            System.out.println("This is not a Pythagorean Triplet.");
        }
    }
    static boolean pythagoreanTriplet(int first, int second, int third) {
        int x = first * first;
        int y = second * second;
        int z = third * third;
        if (x == y + z || y == x + z || z == x + y) {
            return true;
        } else {
            return false;
        }
    }
}
