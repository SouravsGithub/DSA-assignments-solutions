import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to get sum of the first n natural numbers: ");
        int n = in.nextInt();
        System.out.println("The sum of all natural numbers upto " + n + " is " + sum(n));
    }

    static int sum(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = res + i;
        }
        return res;
    }
}
