import java.util.Scanner;
import java.util.ArrayList;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    boolean runner = true;
    double balance = 0.0; 
//create an array for all the things the bank could do 
    ArrayList<String> transactionHistory = new ArrayList<>();
    while(runner) {
        System.out.println("\"====== BANK OF AMERICA ======\"");
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Your Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("5.Check Transaction History");
        System.out.println("Enter your Choice");

        int choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("====== BANK OF AMERICA ======");
            System.out.println("You Selected: Check Balance.");
            System.out.println("Your Current Balance is: " + balance);
        }
        else if(choice == 2) { 
            System.out.println("\"====== BANK OF AMERICA ======\"");
            System.out.println("You Selected: Deposit Cash.");
            System.out.println("Enter Amount to Deposit:");
            double depositAmount = scanner.nextDouble();
            balance += depositAmount;
            System.out.println("Your New Balance is: " + balance);
            transactionHistory.add("Deposited: $" +depositAmount);
        }

        else if(choice == 3) {
            System.out.println("====== BANK OF AMERICA ======");
            System.out.println("You Selected: Withdraw Cash from Your Account.");
            System.out.println("How much would you to withdraw from your account today?");
            double wAmount = scanner.nextDouble();
            if (wAmount <= balance) {
                balance -= wAmount;
                System.out.println("Your new amount is: " + balance);
                transactionHistory.add("Withdrew: $" + wAmount);
            }
            else {
                System.out.println("====== BANK OF AMERICA ======");
                System.out.println("Insufficient Funds");
            }
        }
        else if(choice == 4) {
            System.out.println("====== BANK OF AMERICA ======");
            System.out.println("You Selected: Exit.");
            System.out.println("Thank you for using the ATM. GOODBYE!");
            runner = false;
        }
        else if(choice == 5){
            System.out.println("====== BANK OF AMERICA ======");
            System.out.println("You Selected: 5. Check Transaction History");
            if((transactionHistory.isEmpty())) { 
                System.out.println("No Transaction History Available");
            }
            else{ 
                System.out.println("====== Transaction History ======");
                transactionHistory.forEach(System.out::println);
            }
        }
        else {
            System.out.println("====== BANK OF AMERICA ======");
            System.out.println("Invalid Option Selected");
        } 
    }
}

}

