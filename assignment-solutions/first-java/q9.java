import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Armstrong or not: ");
        int num = sc.nextInt();
        int temp = num;
        int rem;
        int res = 0;
        while (num > 0) {
            rem = num % 10;
            res = res + (rem * rem * rem);
            num = num / 10;
        }
        if (temp == res) {
            System.out.println(temp + " is an armstrong number.");
        } else  {
            System.out.println(temp + " is not an armstrong number.");
        }
    }
}
