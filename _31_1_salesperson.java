/*
Write a program that calculates the total sales and commission for a group of
salespeople. Prompt the user to enter sales figures for each salesperson in a loop. The
loop should continue until a negative number is entered, indicating the end of input.
Calculate and display the total sales and the average sales per salesperson.
 */
import java.util.*;

class _31_1_salesperson {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int total = 0; 
        int count = 0; 
        double sales;

        while (true) {
            System.out.println("Enter sales for each salesperson (negative number to stop):");
            sales = s.nextDouble();

            if (sales < 0) {
                break;
            }

            total += sales;
            count++;
        }

        if (count > 0) {
            double avg = total / count;
            System.out.println("Total Sales: " + total);
            System.out.println("Average Sales per Salesperson: " + avg);
        } 
        else {
            System.out.println("No valid sales entered.");
        }
    }
}
