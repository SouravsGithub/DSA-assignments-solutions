import java.util.Scanner;

public class q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of the asset: ");
        double cost = sc.nextDouble();
        System.out.print("Enter the useful life of the asset in years: ");
        double usefulLife = sc.nextDouble();
        System.out.print("Enter the salvage value of teh asset: ");
        double salvageValue = sc.nextDouble();

        double depreciation = (cost - salvageValue) / usefulLife;
        System.out.print("The annual depreciation on the asset with a useful life of " + usefulLife + " years, a salvage value of " + salvageValue + " and a cost of " + cost + " is " + depreciation);
    }
}
