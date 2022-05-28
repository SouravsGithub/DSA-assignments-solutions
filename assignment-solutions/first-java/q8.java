import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        String strNew = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.trim().charAt(i);
            strNew = strNew + ch;
        }
        if (str.equals(strNew)) {
            System.out.println("The given string is Palindrome.");
        } else {
            System.out.println("The given string is not Palindrome.");
        }
    }
}
