/*
Create a method that checks if a given String is a palindrome (reads the same
forwards and backwards).
Input: "racecar"
Output: true
 */
class _33_str_palidrome{
    public static void main(String args[]){
        String str = "racecar";
        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse+=ch;

        }
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("true");
        }
        else{
            System.out.println("String is not palindrome!!");
        }
        
    }
}