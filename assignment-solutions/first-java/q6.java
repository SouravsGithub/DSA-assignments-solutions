import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter currency in rupees: ");
        float inr = sc.nextFloat();
        float usd = inr / 78;
        System.out.println(inr + " rupees is " + usd + " dollars in USD.");
    }
}
