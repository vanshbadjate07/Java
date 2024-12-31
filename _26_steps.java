/*Create a fitness app that allows users to log their daily steps. The user should be
prompted to enter their steps for each day of the week. Use a loop to collect this data,
and at the end of the week, calculate and display the total steps taken and the average
steps per day */
import java.util.*;
class _26_steps{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int total = 0;
        int steps;
        System.out.println("Enter Steps of SUNDAY: ");
        steps = s.nextInt();
        total +=steps;

        System.out.println("Enter Steps of MONDAY: ");
        steps = s.nextInt();
        total +=steps;
        
        System.out.println("Enter Steps of TUESDAY: ");
        steps = s.nextInt();
        total +=steps;
        
        System.out.println("Enter Steps of WEDNESDAY: ");
        steps = s.nextInt();
        total +=steps;
        
        System.out.println("Enter Steps of THURSDAY: ");
        steps = s.nextInt();
        total +=steps;
        
        System.out.println("Enter Steps of FRIDAY: ");
        steps = s.nextInt();
        total +=steps;

        System.out.println("Enter Steps of SATURDAY: ");
        steps = s.nextInt();
        total +=steps;

        System.out.println("Total Steps: "+total);

        double avg = total/7;
        System.out.println("Average of Steps: "+avg);
        
    }
}