public class PatternMatching {
    public static void main(String[] args) {
        record Person(String firstName, String lastName, int age) {}

        String var1 = "Hello world";
        Integer var2 = 34;
        String[] var3 = {"Hello", "World"};
        Person var4 = new Person("Edwin", "Cardenas", 27);
        Person var5 = new Person("Ana", "Torres", 25);

        Object obj = null;

        // a data type is specified and a new local variable is declared of that specific data type
        //  also allows handling null values
        switch (obj) {
            case String msg -> System.out.println(msg);
            case Integer num -> System.out.println("Your number is: " + num);
            case Person p && p.firstName().length() > 3 -> System.out.println("Looks like Edwin");
            case String[] arr -> System.out.printf("Looks like an array with %d elements", arr.length);
            case null -> System.out.println("It's null");
            default -> System.out.println("Have no idea");
        }
    }
}
