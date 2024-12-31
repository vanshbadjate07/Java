/*
Develop a password validation system that prompts users to create a password. The
program should check if the password meets certain criteria (length, special characters,
etc.). If it doesn't meet the criteria, it should continue prompting the user until a valid
password is entered.
 */

//password must contain 8 character one special symbol (@,#,$,), and numbers in it (0-9)
import java.util.*;
class _25_pass_valid{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        boolean nums = false;
        boolean symbols = false;
        while(true){
            System.out.print("Enter Password: ");
            String pass = s.nextLine();

            for(int i=0;i<pass.length();i++){
                char ch = pass.charAt(i);

                if(ch>= '0' && ch <= '9'){
                    nums = true;
                }
                if(ch == '@' || ch == '#' || ch == '$'){
                    symbols = true;
                }

            }
            if(pass.length()>=8){
                if(nums){
                    if(symbols){
                        System.out.println("Password Is Correct...");
                        break;
                    }
                    else{
                        System.out.println("Password must contain special symbol (@,#,$)");
                    }
                }
                else{
                    System.out.println("Password Must contain 1 number!(0-9)");
                }
            }
            else{
                System.out.println("Password Must Contain 8 Character!");
            }
        }
    }
}