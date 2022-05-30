import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        while (num != 0) {
            if (num > largest) {
                largest = num;
            }
            num = sc.nextInt();
        }
        System.out.println(largest);
    }
}
