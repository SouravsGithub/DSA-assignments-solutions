import java.util.Scanner;

public class q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total runs: ");
        long runs = sc.nextLong();
        System.out.print("Enter the number of matches: ");
        long matches = sc.nextLong();
        System.out.print("Enter the number of not-outs: ");
        long notOuts = sc.nextLong();

        double average = runs / (matches - notOuts);
        System.out.println("The batting average is " + average);
    }
}
