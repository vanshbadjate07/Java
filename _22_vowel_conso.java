/*Write a program that counts the number of vowels and consonants in a given string.
Use a for loop to iterate through the string and keep track of the counts.*/
import java.util.*;
class _22_vowel_conso{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = s.nextLine();

        int vowel=0;
        int consonant=0;
        for(int i=0; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("Total Vowel in "+str+": "+vowel);
        System.out.println("Total Consononants in "+str+": "+consonant);
    }
}