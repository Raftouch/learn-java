package lessons;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isStudent = true;
        boolean isSenior = true;

        double price = 9.99;

        // System.out.print("Whats your age: ");

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a student & senior discount of 30%");
                price *= 0.7;
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            price *= 1;
        }

        System.out.printf("The price of a ticket is: %.2f euros", price);

        scanner.close();
    }
}
