import java.util.Scanner;

public class q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects you have: ");
        int subject = sc.nextInt();
        double[] nums = new double[subject];
        System.out.print("Enter the marks you scored in your papers: ");
        for (int i = 0; i < subject; i++) {
            nums[i] = sc.nextDouble();
        }
        double res = 0;
        for (int i = 0; i < subject; i++) {
            res = res + nums[i];
        }
        double ave = res / subject;
        System.out.println("Your average mark is " + ave);
    }
}
