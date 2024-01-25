import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamExample {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 4, 8, 10, 12);

        // Calculate the average of the squares of numbers greater than 10
        OptionalDouble average = numbers.stream()   // Convert list to stream
                .filter(n -> n > 10)               // Filter numbers greater than 10
                .mapToInt(n -> n * n)              // Square each number
                .average();                        // Calculate average

        // Display the average if it is present
        average.ifPresent(avg -> System.out.println("The average is: " + avg));
    }
}
