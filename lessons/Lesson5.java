package lessons;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        // #1
        // double result;

        // result = Math.pow(2, 3);
        // result = Math.abs(-5);
        // result = Math.sqrt(9);
        // result = Math.round(3.78);
        // result = Math.ceil(3.18);
        // result = Math.floor(3.78);
        // result = Math.max(5, 10);
        // result = Math.min(5, 10);

        // System.out.println(result);

        // #2
        // hypotenuse // c = Math.sqrt(a² + b²)
        // Scanner scanner = new Scanner(System.in);

        // double a;
        // double b;
        // double c;

        // System.out.print("Choose the length of side A: ");
        // a = scanner.nextDouble();

        // System.out.print("Choose the length of side B: ");
        // b = scanner.nextDouble();

        // c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // System.out.println("The hypotenuse is " + c);
        // scanner.close();

        // #3
        // circumference = 2 * Math.PI * radius
        // area = Math.PI * radius²
        // volume = 4/3 * Math.PI * Math.pow(radius, 3)
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("\nThe circumference is: %.2fcm", circumference);
        System.out.printf("\nThe area is: %.2fcm²", area);
        System.out.printf("\nThe volume is: %.2f", volume);

        scanner.close();
    }
}
