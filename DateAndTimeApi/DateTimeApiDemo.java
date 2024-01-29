import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.ZoneId;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        // 1. LocalDate example: It's formatted as YYYY-MM-DD.
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date: " + localDate);

        // 2. LocalTime example: It's formatted as HH:MM:SS.
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time: " + localTime);

        // 3. LocalDateTime example:
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + localDateTime);

        // 4. ZonedDateTime example: It's formatted as YYYY-MM-DDTHH:MM:SS+TimeZone[ZoneId].
        // ex: January 28, 2024, at 3:00 PM Paris time
        // 2024-01-28T15:00:00+01:00[Europe/Paris]
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Current DateTime in Paris: " + zonedDateTime);

        // 5. Instant example:  It's formatted in ISO-8601 standard (UTC). YYYY-MM-DDTHH:MM:SSZ
        // T is simply a separator with no specific meaning other than to delineate the date from the time.
        //  The 'Z' at the end stands for 'Zulu time', which is another way to denote UTC.
        // ex: January 28, 2024, at 15:00 UTC
        // Current Instant: 2024-01-28T15:00:00Z
        Instant instant = Instant.now();
        System.out.println("Current Instant: " + instant);

        // Your specified LocalTime2
        LocalTime localTime2 = LocalTime.of(15, 30); // 3:30 PM
        // 6. Duration example: It provides methods like between, getSeconds, getMinutes, and getHours to calculate and retrieve different components of the duration.
        Duration duration = Duration.between(LocalTime.NOON, localTime2); //LocalTime.NOON (which represents 12:00 PM) 
        System.out.println("Duration since noon: " + duration.toHours() + " hours");

        // 7. Period example: Used to represent a quantity of time in terms of years, months, and days.
        Period period = Period.between(localDate, localDate.plusDays(100));
        System.out.println("Period of 100 days from now: " + period.getDays() + " days");

        // 8. DateTimeFormatter example
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = localDate.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        // 9. TemporalAdjuster example
        LocalDate firstDayOfNextMonth = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month: " + firstDayOfNextMonth);
    }
}
