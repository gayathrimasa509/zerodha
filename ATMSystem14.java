import java.util.Scanner;

class BankAccount { 
    private double balance;

public BankAccount(double initialBalance) {
    this.balance = initialBalance;
}

public double getBalance() {
    return balance;
}

public boolean withdraw(double amount) {
    if (amount > balance) {
        System.out.println("Insufficient funds!");
        return false;
    } else if (amount <= 0) {
        System.out.println("Invalid amount! Please enter a positive number.");
        return false;
    } else {
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
        return true;
    }
}

}

public class ATMSystem14 { 
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in); 
         BankAccount account = new BankAccount(1000); // Initial balance of 1000

        System.out.print("Enter amount to withdraw: ");
        double amount = s.nextDouble();
        account.withdraw(amount);

}

}