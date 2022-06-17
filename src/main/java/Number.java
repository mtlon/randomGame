import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Number {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int number = 0;
    boolean first = false;

    public void meth() {
        System.out.println("CPU randomized number. Try to guess!");
        int rand = random.nextInt(99) + 1;
        System.out.print("Enter number: ");

        while (!first) {

            try {
                number = getInt();

                if(number > 100){
                    System.out.print("Smaller number please (0-100): ");
                } else if (number < 0) {
                    System.out.print("Can't be minus number (0-100)! Again: ");
                }

                if (number > rand && number <= 100) {
                    System.out.print("It's smaller: ");
                } else if (number < rand && number >= 0) {
                    System.out.print("It's bigger: ");
                } else if (number == rand){
                    first = true;
                }

            } catch (InputMismatchException e) {
                System.out.print("It is a string. Enter number:  ");
            }
        }
        System.out.println("You guessed!");
    }
        public static int getInt() {
            return new Scanner(System.in).nextInt();
        }
}


