import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Date");

        // Traditional way using anonymous inner class
        System.out.println("Printing with anonymous inner class:");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // Using lambda expression
        System.out.println("\nPrinting with lambda expression:");
        list.forEach(s -> System.out.println(s));

        // Using method reference
        System.out.println("\nPrinting with method reference:");
        list.forEach(System.out::println);
    }
}
