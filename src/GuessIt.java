import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
//        int randomNumber = new Random().nextInt(3) + 1;
//
//        System.out.printf("Generated number is: %d.%n",randomNumber);

//        if (randomNumber == 1) {
//            System.out.println("red");
//        } else if (randomNumber == 2) {
//            System.out.println("green");
//        } else {
//            System.out.println("blue");
//        }

//        switch (randomNumber) {
//            case 1:
//                System.out.println("red");
//                break;
//            case 2:
//                System.out.println("green");
//                break;
//            default:
//                System.out.println("blue");
//        }

        // enhanced switch
//        switch (randomNumber) {
//            case 1 -> System.out.println("red");
//            case 2 -> System.out.println("green");
//            default -> System.out.println("blue");
//        }

        String card = "6";
        int currentTotalValue = 10;

        // returns a value
        int currentValue = switch (card) {
            case "K", "Q", "J" -> 10;
//            case "A" -> currentTotalValue <= 10 ? 11 : 1;
            case "A" -> {
                if (currentTotalValue <= 10) {
                    yield 11;
                } else {
                    yield 1;
                }
            }
            default -> Integer.parseInt(card);
        };
    }
}
