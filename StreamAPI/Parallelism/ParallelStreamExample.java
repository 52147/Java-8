import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // A large list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // and so on

        // Compute sum of squares in parallel
        int sumOfSquares = numbers.parallelStream()    // Convert list to parallel stream
                .mapToInt(n -> n * n)                  // Square each number
                .sum();                                // Sum the squares

        // Display the result
        System.out.println("The sum of squares is: " + sumOfSquares);
    }
}
