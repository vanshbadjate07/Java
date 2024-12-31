/*
Develop a temperature conversion tool that allows users to convert temperatures
between Celsius and Fahrenheit. Use a loop to continue asking for temperature values
until the user chooses to exit. After each conversion, display the result and prompt the
user again.
 */
import java.util.*;

class _27_temp_conv {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int choice = s.nextInt();

            if (choice == 1) {
                System.out.print("Enter Temperature in Celsius: ");
                float c = s.nextFloat();

                float fahrenheit = ((c * 9) / 5) + 32;
                System.out.printf("Temperature in Celsius: %.2f\n", c);
                System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
            } 
            else if (choice == 2) {
                System.out.print("Enter Temperature in Fahrenheit: ");
                float f = s.nextFloat();

                float celsius = (f - 32) * 5 / 9;
                System.out.printf("Temperature in Fahrenheit: %.2f\n", f);
                System.out.printf("Temperature in Celsius: %.2f\n", celsius);
            } 
            else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            } 
            else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}