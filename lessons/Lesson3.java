package lessons;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

        // #1
        // double total = 120.50;

        // if (total >= 100) {
        // System.out.println("You get a 20% discount!");
        // } else if (total >= 50) {
        // System.out.println("You get a 10% discount!");
        // } else {
        // System.out.println("No discount available.");
        // }

        // #2
        // String day = "Wednesday";

        // if (day.equals("Saturday") || day.equals("Sunday")) {
        // System.out.println("It's the weekend!");
        // } else if (day.equals("Friday")) {
        // System.out.println("Almost the weekend!");
        // } else {
        // System.out.println("It's a weekday");
        // }

        // #3
        int age;
        boolean hasID = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your age: ");
        age = scanner.nextInt();

        if (age >= 18 && hasID) {
            System.out.println("You can enter the club");
        } else if (age >= 18 && !hasID) {
            System.out.println("You must show your ID");
        } else {
            System.out.println("You are too young to enter");
        }

        scanner.close();
    }
}
