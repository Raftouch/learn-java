package practice;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principalAmount;
        double rate; // interest rate
        int n; // number of times compounded;
        int time; // time (years)
        double finalAmount;

        System.out.print("Enter the principal amount: ");
        principalAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        n = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        time = scanner.nextInt();

        finalAmount = principalAmount * Math.pow((1 + rate / n), (n * time));

        System.out.printf("The amount after %d year(s) is %.2f euros: ", time, finalAmount);

        scanner.close();

    }
}
