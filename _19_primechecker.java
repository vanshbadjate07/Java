/*Develop a program that checks whether a given number is prime or not. Use a for loop
to test divisibility. If the number is found to be divisible by any number other than 1 and
itself, it is not prime.*/
import java.util.*;
class _19_primechecker{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = s.nextInt();

        if(num<=1){
            System.out.println(num+ " IS not prime!!");
        }
        else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println(num+ " is not a prime!!");
                    return;
                }
            }
            System.out.println(num+" is prime!!");
        }

    }
}