import java.util.Scanner;

public class q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a character to see if it is vowel or consonant: ");
        char i = sc.next().trim().charAt(0);
        if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
            System.out.println(i + " is a vowel.");
        } else {
            System.out.println(i + " is a consonant.");
        }
    }
}
