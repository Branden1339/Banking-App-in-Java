Simple Banking Application:
This is a simple Java program that simulates a basic banking application. Users can interact with the program to perform operations such as depositing money, withdrawing money, checking their balance, and viewing their most recent transaction.

Usage:
To use the banking application, follow these steps:

Compile the Java files: Compile both BankAccount.java and BankingApplication.java using a Java compiler.

javac BankAccount.java BankingApplication.java

Run the application: Execute the BankingApplication class.
java BankingApplication
Follow the prompts: Once the program starts, follow the prompts to perform banking operations. You can choose options such as checking your balance, depositing money, withdrawing money, and viewing your most recent transaction.

Exit the application: To exit the application, choose the "E" option from the menu.

Features:
Check account balance
Deposit money
Withdraw money
View most recent transaction

Example:
public class BankingApplication {
    public static void main(String[] args) throws Exception {
        BankAccount ba = new BankAccount("Branden Francis", "1339");
        ba.showMenu();
    }
}

Contributing:
Contributions are welcome! If you have any suggestions or improvements for this project, feel free to fork the repository and submit a pull request.








