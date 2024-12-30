//Create a while loop that prompts the user for their flight choice until a valid number is entered
import java.util.*;
class _2_flight{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter Flight Choice(1-5):");
            int choice = s.nextInt();

            if(choice>=1 && choice<=5){
                System.out.println("You Selected:"+choice);
            }
            else{
                break;
            }
        }
    }
}