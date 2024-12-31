/*
Write a Java program that reverses the contents of a StringBuffer initialized with "Java
Programming".
Input: "Java Programming"
Output: "gnimmargorPavaJ"
 */
class _37_reverse_stringB{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Java Programming");

        sb.reverse();

        System.out.println(sb);
    }
}