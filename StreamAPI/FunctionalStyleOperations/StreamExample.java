import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // List of persons
        List<Person> persons = Arrays.asList(
                new Person("Alice", 16),
                new Person("Bob", 23),
                new Person("Charlie", 17),
                new Person("David", 30),
                new Person("Eve", 45)
        );

        // Filter, transform, and collect using Stream API
        List<String> namesOfAdults = persons.stream()            // Convert list to stream
                .filter(person -> person.getAge() >= 18)         // Filter persons over 18
                .map(person -> person.getName().toUpperCase())   // Convert names to uppercase
                .collect(Collectors.toList());                   // Collect results into a list

        // Display the result
        System.out.println(namesOfAdults);
    }
}
