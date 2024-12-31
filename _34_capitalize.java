/*
Implement a method that capitalizes the first letter of each word in a given String.
Input: "hello world"
Output: "Hello World"
 */
class _48_capitalfirstletter {
    public static void main(String args[]) {
        String input = "hello world";

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            
            String firstLetter = words[i].substring(0, 1).toUpperCase();
            
            String restOfWord = words[i].substring(1);
            
            result.append(firstLetter + restOfWord + " ");
        }

        System.out.println(result.toString().trim());
    }
}
