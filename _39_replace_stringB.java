/*
Write a Java program that replaces "Java" with "Python" in a StringBuffer initialized with "I
love Java programming".
Input: "I love Java programming"
Output: "I love Python programming"
 */
class _39_replace_stringB{
    public static void main(String args[]){
        StringBuffer s = new StringBuffer("I love Java programming");
        System.out.println(s.replace(7,11,"Python"));
    }
}