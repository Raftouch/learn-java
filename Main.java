import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi there!");

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Your name: ");
        // String name = scanner.nextLine();

        System.out.print("Your age: ");
        int age = scanner.nextInt();
        // double average = scanner.nextDouble();

        // System.out.print("Are you a student? (true/false): ");
        // boolean isStudent = scanner.nextBoolean();
        scanner.nextLine(); // to escape a common problem with a new line

        System.out.print("Your name: ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name);
        System.out.println("You are " + age + " years old");

        // if (isStudent) {
        // System.out.println("You are a student");
        // } else {
        // System.out.println("You are not a student");
        // }

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Width: ");
        width = scanner.nextDouble();

        System.out.print("Height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + " cm²");

        scanner.close(); // !!! IMPORTANT
    }
}