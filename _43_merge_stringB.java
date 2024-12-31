/*
Create a method that takes two StringBuffer objects and merges them into one, separating
them with a space. Print the resulting StringBuffer.
Input: StringBuffer1: "Hello", StringBuffer2: "World"
Output: "Hello World"
 */
class _43_merge_stringB{
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("World");

        sb1.append(" ").append(sb2);
        System.out.print(sb1);
    }
}