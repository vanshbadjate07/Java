/*
Write a Java program that appends the string " World" to an existing StringBuffer containing
"Hello".
Input: "Hello"
Output: "Hello World"
 */
class _35_append_string{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("World");
        System.out.println(sb.append(" "+sb2));
    }
}