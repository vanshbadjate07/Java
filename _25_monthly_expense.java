/*
You are tasked with developing a program that tracks a user's monthly expenses. The
program should repeatedly ask the user to input their expenses for different categories
(like food, transportation, etc.) until they type "done". After the user is finished, display
the total expenses for the month
 */
import java.util.*;
class _25_monthly_expense{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int food_cost=0;
        int travel_cost=0;
        int other_cost=0;
        int expense = 0;

        while(true){
            System.out.println("Enter Category: (Enter Done to Exit)");
            System.out.println("1. Food");
            System.out.println("2. Travel");
            System.out.println("3. other");
            String choice = s.nextLine();

            if(choice.equals("Done")||choice.equals("done")){
                break;
            }
            switch(choice){
                case "1":
                    System.out.println("Enter Food Cost: ");
                    food_cost = s.nextInt();
                    expense += food_cost;
                    s.nextLine();
                    break;
                
                case "2":
                    System.out.println("Enter Travel Cost: ");
                    travel_cost = s.nextInt();
                    expense += travel_cost;
                    s.nextLine();
                    break;
                
                case "3":
                    System.out.println("Enter other Cost: ");
                    other_cost = s.nextInt();
                    expense += other_cost;
                    s.nextLine();
                    break;

                default:
                    System.out.println("Enter Valid Category!!");
                    
            }

        }
        System.out.println("Total Monthly Expense: "+expense);
    }
}