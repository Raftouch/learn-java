package lessons;

public class Lesson6 {
    public static void main(String[] args) {

        // printf
        // %[flags][width][.precision][specifier-character]

        String name = "Rafael";
        char firstLetter = 'R';
        int age = 5;
        double height = 24.5;
        boolean isDog = true;

        System.out.printf("\nHi %s", name);
        System.out.printf("\nYour name starts with a %c", firstLetter);
        System.out.printf("\nYou are %d years old", age);
        System.out.printf("\nYou are %.1fcm tall", height);
        System.out.printf("\nYou are a dog: %b", isDog);

        System.out.printf("\n\n%s is %d years old", name, age);

        // [flags]
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 8.56;
        double price2 = 100.43;
        double price3 = -25.89;
        double price4 = -12.51;

        System.out.printf("\n%+.2f", price1);
        System.out.printf("\n%+.2f", price2);
        System.out.printf("\n%(.2f", price3);
        System.out.printf("\n% .2f", price4);
        System.out.printf("\n% .2f", price1);

        // [width]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 24;
        int id3 = 356;
        int id4 = 7804;

        System.out.printf("\n%04d", id1);
        System.out.printf("\n%04d", id2);
        System.out.printf("\n%04d", id3);
        System.out.printf("\n%04d", id4);

        System.out.printf("\n%4d", id1);
        System.out.printf("\n%4d", id2);
        System.out.printf("\n%4d", id3);
        System.out.printf("\n%4d", id4);
    }
}
