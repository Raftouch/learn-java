package practice;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String noun1;
        String verb1;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (toy/smth to eat): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter a verb (ending with -ed): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " zoo");
        System.out.println("There I bought a " + noun1 + " for my dog");
        System.out.println("My dog " + verb1 + " it as it was " + adjective2);

        scanner.close();
    }
}
