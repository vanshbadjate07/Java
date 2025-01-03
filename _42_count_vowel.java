/*
Create a method that counts the number of vowels in a StringBuffer. Initialize it with any
string and print the number of vowels.
Input: "Hello World"
Output: 3
 */
class _42_count_vowel{
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello World");

        String s = sb.toString();

        int vowel = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                vowel++;
            }
        }
        System.out.println("String Is: "+s);
        System.out.println("Total Vowels Are: " + vowel);
    }
}