import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to get it's factorial: ");
        int num = in.nextInt();
        int ans = factorial(num);
        System.out.println("The factorial of the above number is " + ans);
    }
    static int factorial(int num) {
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}
