import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        int numberOfGuesses = 0;
        int MAX_ALLOWED_TRIES = 4;
        String guessedNumStr = null;

        System.out.println(randomNum);

        do {
            guessedNumStr = System.console()
                    .readLine("Please guess a number between 1 and 10 inclusively: ");

            numberOfGuesses++;

            if (numberOfGuesses >= MAX_ALLOWED_TRIES) {
                System.out.printf("You only had 4 guesses. The correct number was %d.%nGAME OVER%n", randomNum);

                break;
            }

            if (guessedNumStr.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(guessedNumStr);

                if (randomNum == guessedNum) {
                    String tryText = numberOfGuesses == 1 ? "try" : "tries";

                    System.out.printf("The random number was %d. You got it in only %d %s!%n",
                            randomNum, numberOfGuesses, tryText);

                    break;
                } else {
                    System.out.println("You didn't get it!");
                }
            }
        } while (!guessedNumStr.equals("q"));
    }
}
