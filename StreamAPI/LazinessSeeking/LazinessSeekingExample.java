import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazinessSeekingExample {
    public static void main(String[] args) {
        // A list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Define a stream with intermediate operations but no terminal operation
        System.out.println("Defining the stream...");
        numbers.stream()
                .filter(n -> {
                    System.out.println("Filtering " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("Mapping " + n);
                    return n * 3;
                });

        // Notice that nothing has been printed out yet, because no terminal operation has been invoked

        // Now, let's define a terminal operation
        System.out.println("Adding a terminal operation...");
        List<Integer> result = numbers.stream()
                .filter(n -> {
                    System.out.println("Filtering " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("Mapping " + n);
                    return n * 3;
                })
                .collect(Collectors.toList());

        // Now, the intermediate operations are actually executed, and their results are printed
        System.out.println("Result: " + result);
    }
}
