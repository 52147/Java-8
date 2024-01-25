import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // List of transactions
        List<Transaction> transactions = Arrays.asList(
                new Transaction("txn1", 1000),
                new Transaction("txn2", 500),
                new Transaction("txn3", 1300),
                new Transaction("txn4", 700),
                new Transaction("txn5", 900)
        );

        int threshold = 800;

        // Filter, sort, transform, and collect using Stream API
        List<String> highValueTransactionIds = transactions.stream()  // Convert list to stream
                .filter(t -> t.getValue() > threshold)                 // Filter transactions over threshold
                .sorted((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue())) // Sort by value
                .map(Transaction::getId)                               // Extract transaction IDs
                .collect(Collectors.toList());                         // Collect results into a list

        // Display the result
        System.out.println(highValueTransactionIds);
    }
}
