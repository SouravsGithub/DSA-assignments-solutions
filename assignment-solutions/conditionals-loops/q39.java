import java.util.Scanner;

public class q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get teh sum of numbers up to that number: ");
        int num = sc.nextInt();
        int sum = (num * (num + 1)) / 2;

        System.out.println("The sum is " + sum);
    }
}
