import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating Optional objects
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> nonEmptyOptional = Optional.of("Hello");
        Optional<String> nullableOptional = Optional.ofNullable(null);

        // Accessing the value within an Optional using get()
        try {
            System.out.println("Non-empty optional value: " + nonEmptyOptional.get());
            System.out.println("Empty optional value: " + emptyOptional.get());
        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException: " + e.getMessage());
        }

        // Using orElse
        String valueOrElse = nullableOptional.orElse("Default Value");
        System.out.println("Value or default: " + valueOrElse);

        // Using orElseGet with a supplier
        String valueOrElseGet = nullableOptional.orElseGet(() -> "Default from supplier");
        System.out.println("Value or else get: " + valueOrElseGet);

        // Using orElseThrow with a supplier for the exception
        try {
            String valueOrThrow = nullableOptional.orElseThrow(() -> new IllegalStateException("Value is absent"));
            System.out.println("Value or throw: " + valueOrThrow);
        } catch (IllegalStateException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

