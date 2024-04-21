package Day10.Password;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birthday
        System.out.print("Enter your birthday (YYYY-MM-DD): ");
        String birthdayString = scanner.nextLine();

        // Parse the user input into a LocalDate object
        LocalDate birthday = LocalDate.parse(birthdayString, DateTimeFormatter.ISO_DATE);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthday and the current date
        Period period = Period.between(birthday, currentDate);

        // Display the age in years, months, and days
        System.out.println("You are " + period.getYears() + " years, " +
                period.getMonths() + " months, and " +
                period.getDays() + " days old.");
        
        // Close the scanner
        scanner.close();
    }
}
