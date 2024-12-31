/*
Create a program that reverses the digits of a given integer. Use a while loop to extract
each digit and build the reversed number.
 */
import java.util.*;
class _20_reverse_num{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = s.nextInt();
        int reverse = 0;
        System.out.println("Number Before Reverse: "+num);

        while(num!=0){
            int digit = num %10;
            reverse = reverse * 10 + digit;
            num = num /10;
        }
        System.out.println("Number After Reverse: "+reverse);


    }
}