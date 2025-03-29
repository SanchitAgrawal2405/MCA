package week_9;

// Custom exception for handling insufficient funds scenario
class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// ATM class to simulate withdrawals
class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        System.out.println("Attempting to withdraw: $" + amount);

        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient funds! Available balance: $" + balance);
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: $" + balance);
    }
}

// Main class to test ATM transactions
public class Problem5 {
    public static void main(String[] args) {
        // Initialize ATM with $500
        ATM atm = new ATM(500);

        try {
            atm.withdraw(200);  // Valid withdrawal
            atm.withdraw(350);  // This should throw an exception
        } catch (InsufficientFundsException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }
    }
}
