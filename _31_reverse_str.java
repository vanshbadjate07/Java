//Write a Java program to reverse a String.
import java.util.*;
class _31_reverse_str{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = s.nextLine();

        String reverse ="";

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);

            reverse +=ch;
        }
        System.out.println("String Before: "+str);
        System.out.println("String After Reverse: "+reverse);
    }
}