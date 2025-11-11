public class ATM {
    private double balance;
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Withdrawal failed: requested ₹" + amount + " but available balance is ₹" + (int)balance
            );
        }
        balance -= amount;
        System.out.println("Please collect your cash: ₹" + amount);
        System.out.println("Remaining balance: ₹" + (int)balance);
    }
}



/////// main

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ATM atm = new ATM(10000);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw (₹): ");
        int amount = 0;
        try {
            amount = Integer.parseInt(sc.nextLine());
            atm.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
            
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid numeric amount.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid request: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our ATM.");
            sc.close();
        }
    }
}
