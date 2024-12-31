/*
Write a Java program that initializes a StringBuffer with extra spaces (e.g., " Hello World ")
and trims the whitespace from both ends.
Input: " Hello World "
Output: "Hello World"
 */
class _43_trim_white{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("    Hello World     ");

        String trim_str = sb.toString().trim();

        StringBuffer sb_new = new StringBuffer(trim_str);

        System.out.println("String Before: "+sb);
        System.out.println("String After: "+sb_new);
    }
}