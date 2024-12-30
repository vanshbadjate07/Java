//Prints a multiplication table but skips the multiplication by 5.
import java.util.*;
class _16_multiply_skip5{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = s.nextInt();

        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(num+ "X" +i+ "=" +(num*i));
        }
    }
}