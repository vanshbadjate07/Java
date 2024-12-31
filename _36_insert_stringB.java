/*
Create a method that inserts the string "Beautiful " at index 6 in the StringBuffer containing
"Hello World".
Input: "Hello World"
Output: "Hello Beautiful World"
 */
class _36_insert_stringB{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello World");
        StringBuffer sb2 = new StringBuffer(sb.insert(6,"Beautiful "));

        System.out.println(sb2);
    }
}