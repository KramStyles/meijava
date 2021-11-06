package meicode.tutorial.org;

import java.util.Random;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        randomGame();
    }

    private static void randomGame(){
        /*  Todo: Show a welcome message
            Todo: Ask for user's name and say hello
            Todo: Ask to start the game
            Todo: After positive feedback, Generate a random number and ask user to guess
            Todo: If the guess is correct, show a congratulatory message and quit game
            Todo: Keep asking until you receive the correct answer
            Todo: Include hint of higher or lower to the user after the first guess
            Todo: If the user fails 8 Times, show a game over message and quit the game

         */

        System.out.println("Good Day and welcome to our Random Game");
        System.out.println("What is your name: ");

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.println("Hello ".concat(username) + ". Nice to meet you! Shall we play the game? (Y/N)");
        char permission = scanner.next().toUpperCase().charAt(0); // Convert's the character to a single char

        if (permission == 'N') {
            System.exit(0);
        } else{
            Random random = new Random();
            int guessNumber = (random.nextInt(100));
            int count = 8;

            System.out.println("Guess the random number generated");
            do {
                int guess = scanner.nextInt();
                if (guessNumber == guess){
                    System.out.println("Wonderful. Your guess ("+guess+") is correct");
                    System.exit(0);
                } else if(guess > guessNumber) {
                    System.out.println("Your guess is too high. Please try again");
                } else{
                    System.out.println("Your guess is actually low. Guess again");
                }
                count--;

            } while (count > 0);
            System.out.println("Game over. The answer is: " + guessNumber);
            System.exit(0);
        }
    }

    private static void genRandom(){
        Random random = new Random();
        System.out.println(random.nextInt(200) + 100);
    }

    private static void scan() {
        System.out.println("Type a number: ");
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        System.out.println("Type in a name: ");
        String name1 = scanner.next();

        System.out.println("Number: " + number1 + " Name: ".concat(name1));
    }
}
