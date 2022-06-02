import java.util.Scanner;

public class q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res1 = 0; //sum of negative numbers
        int res2 = 0; //sum of positive even numbers
        int res3 = 0; //sum of positive odd numbers

        System.out.print("Enter a number. Enter 0 to exit.: ");
        int x = sc.nextInt();
        while (x != 0) {
            if (x < 0) {
                res1 = res1 + x;
            } else if (x % 2 == 0) {
                res2 = res2 + x;
            } else {
                res3 = res3 + x;
            }
            x = sc.nextInt();
        }
        System.out.println("The sum of all negative numbers is " + res1);
        System.out.println("The sum of all positive even numbers is " + res2);
        System.out.println("The sum of all positive odd numbers is " + res3);

    }
}
