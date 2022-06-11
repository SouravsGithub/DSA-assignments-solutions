import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check if it is palindrome or not: ");
        int n = in.nextInt();
        boolean ans = isPalindrome(n);
        System.out.println(ans);
    }

    static boolean isPalindrome(int n) {
        int res = 0;
        int rem;
        int original = n;
        while (n > 0) {
            rem = n % 10;
            res = res * 10 + rem;
            n /= 10;
        }
        if (original == res) {
            return true;
        } else {
            return false;
        }
    }
}
