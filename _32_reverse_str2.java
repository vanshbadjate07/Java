/*Write a Java program to reverse a given String without using the built-in reverse
method.
Example:
Input: "Hello"
Output: "olleH"
*/
class _32_reverse_str2{
    public static void main(String args[]){

        String str = "Hello";

        String reverse ="";

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);

            reverse +=ch;
        }
        System.out.println("Input: "+str);
        System.out.println("Output: "+reverse);
    }
}