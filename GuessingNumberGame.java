
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int guesses = 0;
        int num = 0;
        while (num != numberDrawn) {
            System.out.print("Guess a number: ");
            num = Integer.parseInt(reader.nextLine());
            guesses++;
            if (num == 2 && numberDrawn == 1) {
                System.out.println("The number is lesser, guesses made: " + guesses);
                break;
            }
            if (num > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guesses);
            } else {
                System.out.println("The number is greater, guesses made: " + guesses);
            }
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
