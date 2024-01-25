import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamTimingExample {
    public static void main(String[] args) {
        // Generate a large list of random numbers
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            numbers.add(random.nextInt(100));
        }

        // Measure time taken for summing the numbers using sequential stream
        long startTimeSequential = System.currentTimeMillis();
        long sumSequential = numbers.stream().mapToLong(i -> i).sum();
        long endTimeSequential = System.currentTimeMillis();
        System.out.println("Sequential Stream Sum: " + sumSequential);
        System.out.println("Time taken with sequential stream: " + (endTimeSequential - startTimeSequential) + "ms");

        // Measure time taken for summing the numbers using parallel stream
        long startTimeParallel = System.currentTimeMillis();
        long sumParallel = numbers.parallelStream().mapToLong(i -> i).sum();
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("Parallel Stream Sum: " + sumParallel);
        System.out.println("Time taken with parallel stream: " + (endTimeParallel - startTimeParallel) + "ms");
    }
}
