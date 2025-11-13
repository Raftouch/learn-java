package lessons;

import java.util.Random;

public class Lesson4 {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double number4;
        boolean isHeads;

        number1 = random.nextInt(1, 7); // 1-6
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        number4 = random.nextDouble();
        System.out.println(number4);

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
