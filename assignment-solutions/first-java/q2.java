import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello Mr " + name + ". Nice to meet you.");
    }
}
