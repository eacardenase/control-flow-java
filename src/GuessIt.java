import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(3) + 1;

        System.out.printf("Generated number is: %d.%n",randomNumber);

        if (randomNumber == 1) {
            System.out.println("red");
        } else if (randomNumber == 2) {
            System.out.println("green");
        } else {
            System.out.println("blue");
        }
    }
}
