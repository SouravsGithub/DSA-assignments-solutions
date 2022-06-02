import java.util.Scanner;

public class q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check it is leap or not: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("Not a leap year.");
            }
            System.out.println("leap year.");
        } else {
            System.out.println("Not a leap year.");
        }
    }
}
