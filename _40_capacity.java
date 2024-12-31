/*
Write a program that creates a StringBuffer, checks its initial capacity, and then appends
enough characters to exceed that capacity. Print the new capacity.
Input: Initial capacity of StringBuffer
Output: New capacity after appending characters
 */
class _40_capacity{
    public static void main(String args[]){
        StringBuffer s = new StringBuffer();
        System.out.println("Initial capacity of StringBuffer: "+s.capacity());
        s.append("It is what it is! Thats why it is");
        System.out.println("New capacity after appending characters: "+s.capacity());
    }
}