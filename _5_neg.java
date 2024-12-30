//Implement a do-while loop that prompts the user to enter a number until they enter a negative number
import java.util.*;
class _5_neg{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter Number: ");
            num = s.nextInt();

        }while(num>=0);
    }
}