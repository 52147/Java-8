import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // List of products
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.99, true),
                new Product("Smartphone", 699.49, false),
                new Product("Tablet", 350.00, true),
                new Product("Headphones", 150.49, true),
                new Product("Camera", 899.99, true)
        );

        // Filter, transform, sort, and collect using Stream API
        List<String> inStockProductNamesSortedByPrice = products.stream() // Convert list to stream
                .filter(Product::isInStock)                                  // Filter in-stock products
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())) // Sort by price
                .map(product -> product.getName().toUpperCase())           // Convert names to uppercase
                .collect(Collectors.toList());                             // Collect results into a list

        // Display the result
        System.out.println(inStockProductNamesSortedByPrice);
    }
}
