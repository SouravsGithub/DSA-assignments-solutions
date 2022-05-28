import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number up to which you want the Fibonacci series: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        System.out.println(a);
        System.out.println(b);
        int i = 2;
        while (i < num) {
            System.out.println(a + b);
            temp = b;
            b = a + b;
            a = temp;
            i++;
        }
    }
}
