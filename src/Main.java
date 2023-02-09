//import jdk.nashorn.internal.codegen.LocalStateRestorationInfo;

import java.io.*;
import java.util.Scanner;
import java.util.Random;

class GuessTheNumber {
    private static final int tries = 10;
    public static void main(String [] args)
    {
        int i;
        int guess;
        Random rand = new Random();
        int number = 101 + rand.nextInt(900);
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < tries; i++)   {
            System.out.printf("Guess the three digit number. Hint: between 100 and 999. You have %d tries left.", tries - i);
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("You guessed right!!");
                break;
            } else if (i < (tries - 1)) {
                if ((guess < 100) || (guess > 999))
                {
                    System.out.println("Hint: Please guess a three digit number only!!");
                }
                else if (guess < number) {
                    System.out.println("Hint: Please guess higher!!");
                } else if (guess > number) {
                    System.out.println("Hint: Please guess lower!!");
                }
            }
        }

        if (i == tries) {
            System.out.printf("Sorry you lost!! The number was %d", number);

        }
    }
}