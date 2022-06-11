import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle to know it's circumference and area: ");
        float r = in.nextFloat();
        circumference(r);
        area(r);
    }

    static void area(float r) {
        float area = (float)(Math.PI) * r * r;
        System.out.println("The area of the circle is " + area);
    }

    static void circumference(float r) {
        float c = 2 * (float)(Math.PI) * r;
        System.out.println("The circumference of the circle is " + c);
    }
}
