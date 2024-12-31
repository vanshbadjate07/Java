/*
Write a method that converts a StringBuffer to a String and returns it. Initialize a
StringBuffer with "Hello World" and use your method to print the resulting string.
Input: StringBuffer initialized with "Hello World"
Output: "Hello World"
 */
class _41_stringB_string{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello World");

        String str = sb.toString();

        System.out.println(str);
    }
}