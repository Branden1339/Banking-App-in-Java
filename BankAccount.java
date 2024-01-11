import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customername;
    String customerId;

    public BankAccount(String cname, String cid){
        customername = cname;
        customerId = cid;
    }

    void deposit(int amount){
        if(amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount != 0){
            balance -= amount;
            previousTransaction = -amount;
        }
    }
    void getpreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdraw: "+Math.abs(previousTransaction));
        }
        else{
            System.out.println("No transaction found");
        }
    }
    void showMenu(){
        char option= '\0';
        Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome To Your Online Banking System");
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.println("Hello: " + customername);
    System.out.println("ID: "+ customerId);
    System.out.println("\n");
    System.out.println("Select an option");
    System.out.println("A. Check Account Balance");
    System.out.println("B. Deposit Money");
    System.out.println("C. Withdraw money");
    System.out.println("D. See you most recent transaction");
    System.out.println("E. EXIT");

    do{
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Option: ");
        option = scanner.next().charAt(0);
        System.out.println("\n");

        switch(option){
            case 'A':
            System.out.println("---------------------------");
            System.out.println("Your Balance is: $" + balance);
            System.out.println("---------------------------");
            break;

            case 'B':
            System.out.println("---------------------------");
            System.out.println("Enter amount to deposit:");
            System.out.println("---------------------------");
            int amount = scanner.nextInt();
            deposit(amount);
            System.out.println("\n");
            System.out.println("You deposited: $" + amount);
            break;

            case 'C':
            System.out.println("---------------------------");
            System.out.println("Enter amount to withdraw:");
            System.out.println("---------------------------");
            int amount2 = scanner.nextInt();
            withdraw(amount2);
            System.out.println("\n");
            System.out.println("You withdrew: $" + amount2);
            break;

            case 'D':
            System.out.println("---------------------------");
            getpreviousTransaction();
            System.out.println("---------------------------");
            break;

            default:
                System.out.println("Invalid Option!!. Try Again");
        }
    }
     while(option != 'E');
        System.err.println("You have now exited");
    }
    
}

