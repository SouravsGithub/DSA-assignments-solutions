import java.util.Scanner;

public class q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res = 0;
        int rem;

        while (num > 0) {
            rem = num % 10;
            res = res + rem;
            num /= 10;
        }
        System.out.println(res);
    }
}
