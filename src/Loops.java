import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;

        while (true) {
            String guessedNumStr = System.console()
                    .readLine("Please guess a number between 1 and 10 inclusively: ");
            int guessedNum = Integer.parseInt(guessedNumStr);

            if (randomNum == guessedNum) {
                System.out.printf("The random number was %d. You got it!%n", randomNum);

                break;
            } else {
                System.out.println("You didn't get it!");
            }
        }
    }
}
