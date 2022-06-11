import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        System.out.print("Enter the number of subjects you have: ");
        Scanner in = new Scanner(System.in);
        int subs = in.nextInt();
        int[] marks = new int[subs];
        String[] grades = new String[subs];
        int[] res1 = marks(marks, subs);
        String[] res2 = grades(grades, res1, subs);
        System.out.println("Marks           Grades");
        for (int k = 0; k < subs; k++) {
            System.out.println(res1[k] + "              " + res2[k]);
        }
    }
    static int[] marks(int[] marks, int subs) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        for (int i = 0; i < subs; i++) {
            marks[i] = in.nextInt();
        }
        return marks;
    }

    static String[] grades(String[] grades, int[] marks,  int subs) {
        for (int j = 0; j < subs; j++) {
            if (marks[j] <= 100 && marks[j] >= 91) {
                grades[j] = "AA";
            }
            else if (marks[j] <= 90 && marks[j] >= 81) {
                grades[j] = "AB";
            }
            else if (marks[j] <= 80 && marks[j] >= 71) {
                grades[j] = "BB";
            }
            else if (marks[j] <= 70 && marks[j] >= 61) {
                grades[j] = "BC";
            }
            else if (marks[j] <= 60 && marks[j] >= 51) {
                grades[j] = "CD";
            }
            else if (marks[j] <= 50 && marks[j] >= 41) {
                grades[j] = "DD";
            }
            else if (marks[j] <= 40) {
                grades[j] = "Fail";
            }
        }
        return grades;
    }
}
