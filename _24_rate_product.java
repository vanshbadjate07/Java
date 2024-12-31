/*
As part of a feedback collection system, you want to gather customer ratings for a
product. Design a program that prompts customers to rate the product from 1 to 5. Use
a labeled while loop to continue collecting ratings until a customer enters 0. After
collecting all ratings, compute and display the average rating and the number of ratings
received.
 */
import java.util.*;
class _24_rate_product{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int total = 0;
        int count=0;

        while(true){
            System.out.println("\nRate Our Product(1 to 5) Press 0 to exit: ");
            int rate = s.nextInt();
            if(rate>=1 && rate<=5){
                count++;
                total +=rate;
            }
            else if(rate == 0){
                break;
            }
            else{
                System.out.println("Enter Valid Rating (1 to 5)!!");
            }
            
        }
        if (count > 0) {
            System.out.println("Total Ratings Received: " + count);

            double avg = (double) total / count;
            System.out.println("Average Rating: " + avg);
            
        } else {
            System.out.println("No ratings received.");
        }
    }
}