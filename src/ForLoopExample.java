public class ForLoopExample {
    public static void main(String[] args) {
//        int i; // by default have 0 as value
//
//        for (i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        String[] fruits = {"apple", "orange", "banana", "pear"};

//        for (int i = 0; i < fruits.length; i++) {
//            System.out.printf("The current fruit is %s.%n", fruits[i]);
//        }

        for (String fruit : fruits) {
            System.out.printf("The current fruit is %s.%n", fruit);
        }
    }
}
