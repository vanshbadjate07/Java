/*
Create a method that deletes a substring from a StringBuffer. For example, remove "World"
from "Hello World".
Input: "Hello World"
Output: "Hello "
 */
class _38_substring_stringB{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello World");
        
        System.out.println(sb.delete(6,11));
    }
}