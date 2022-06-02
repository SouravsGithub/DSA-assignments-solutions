public class q51 {
    public static void main(String[] args) {
        int daysInAugust = 31;
        int days = 0;

        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                days++;
            }
        }
        System.out.println("Kunal can go out with his friends for" + days + " days in the month of August.");
    }
}
