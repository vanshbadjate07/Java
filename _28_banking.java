/*
Implement a simple banking system where users can deposit and withdraw money. Use
a loop to allow the user to perform transactions until they choose to exit. After exiting,
display the final account balance and transaction history.
 */
import java.util.*;
class _28_banking{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int balance = 1000;
        List<String> transactions = new ArrayList<>(); 

        while(true){
            System.out.println("\nSelect Choice: ");
            System.out.println("1. Deposite");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            int choice = s.nextInt();

            if(choice == 1){
                System.out.println("Enter Amount to Deposite: ");
                int depo = s.nextInt();
                if(depo>0){
                    balance +=depo;
                    System.out.println("Amount Deposited Successfully\nCurrent Balance: "+balance);
                    transactions.add("Deposited: " + depo);
                }
                else{
                    System.out.println("Amount must be greater than 0.");
                }
            }

            else if(choice == 2){
                System.out.println("Enter Amount to Withdraw: ");
                int with = s.nextInt();

                if(with>0 && with<=balance){
                    balance -= with;   
                    System.out.println("Amount Withdraw Successfully!!\nCurrent Balance: "+balance); 
                    transactions.add("Withdrawn: " + with);
                }
                else if (with > balance) {
                    System.out.println("Insufficient balance!");
                } 
                else {
                    System.out.println("0 Cannot be withdraw!!");
                }
            }

            else if(choice == 3){
                System.out.println("Exitin...");
                break;
            }
            else{
                System.out.println("Enter Valid Choice!!");
            }
        }
        System.out.println("\nFinal Account Balance: " + balance);
        System.out.println("Transaction History:");

        if (transactions.size() > 0) {
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println(transactions.get(i));
            }
        } 
        else {
            System.out.println("No transactions.");
        }

    }
}