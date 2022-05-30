import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number up to which position you want the fibonacci series: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        System.out.println(a);
        for (int i = 1; i < num; i++) {
            System.out.println(b);
            temp = b;
            b = a + b;
            a = temp;
        }
    }
}
