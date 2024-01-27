import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        // Example 1: No Parameters
        Runnable runnable = () -> System.out.println("Hello World");
        runnable.run();

        // Example 2: One Parameter
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("One parameter example");

        // Example 3: Multiple Parameters
        BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
        System.out.println("Sum of 5 and 10: " + adder.apply(5, 10));

        // Example 4: Complex Expressions (Block of Code)
        BiFunction<Integer, Integer, Integer> complexAdder = (a, b) -> {
            int sum = a + b;
            return sum;
        };
        System.out.println("Complex Sum of 7 and 3: " + complexAdder.apply(7, 3));
    }
}

