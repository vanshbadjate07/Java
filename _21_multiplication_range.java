/*Write a program that prints the multiplication table for a given number. The user
should input the number and the range (e.g., up to 10 or 20). Use a for loop to generate
the table.*/
import java.util.*;
class _21_multiplication_range{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number for table: ");
        int num = s.nextInt();

        System.out.println("Enter Range: ");
        int range = s.nextInt();

        for(int i=1;i<=range;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}