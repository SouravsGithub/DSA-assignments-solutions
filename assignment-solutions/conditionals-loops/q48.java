import java.util.Scanner;

public class q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is perfect number or not: ");
        int num = sc.nextInt();
        int res = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                res = res + i;
            }
        }
        if (res == num) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It is not a perfect number.");
        }
    }
}
