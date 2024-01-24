import java.util.Random;

public class NumbersGame {
    public static void main(String[] args) {
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
            System.out.println("*********************************************************");
            System.out.println("Can you guess the number?");
            System.out.println("If you are not up to the task, you can always type 'q' to quit.");

            int answer = new Random().nextInt(11);
            boolean correctGuess = false;

            for (int attempt = 0; attempt < 3; attempt++) {
                String guess = System.console().readLine();

                if (guess.equals("q")) {
                    System.out.println("I knew you didn't have it in you.");
                    System.out.println("Shutting down...");
                    playAgain = false;
                    break; // Break the loop if the user wants to quit
                }

                try {
                    int parsedGuess = Integer.parseInt(guess);

                    if (parsedGuess < 0 || parsedGuess > 10) {
                        System.out.println("Your number is not between 0 and 10...");
                    } else if (parsedGuess == answer) {
                        System.out.println("Lucky guess! But can you do it again?");
                        correctGuess = true;
                        break; // Break the loop if the guess is correct
                    } else {
                        System.out.println("Swing and a miss! Keep trying...");
                    }
                } catch (NumberFormatException n) {
                    System.out.println("You should type a number between 0 and 10 or 'q' to quit.");
                }
            }

            if (!correctGuess) {
                System.out.println("Game over. The correct answer was: " + answer);
            }

            // Ask if the user wants to play again
            if (playAgain) {
                System.out.println("Do you want to play again? (yes/no)");
                String playAgainInput = System.console().readLine().toLowerCase();
                playAgain = playAgainInput.equals("yes");
            }
        }

        System.out.println("Thank you for playing. Goodbye!");
    }
}