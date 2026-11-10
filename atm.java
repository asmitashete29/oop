import java.util.Scanner;

public class ATM {
    private double balance = 1000;

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be greater than zero"
            );
        }

        balance = balance + amount;

        System.out.println(
            amount + " deposited successfully"
        );
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be greater than zero"
            );
        }

        if (amount > balance) {
            throw new ArithmeticException(
                "Insufficient funds in account"
            );
        }

        balance = balance - amount;

        System.out.println(
            amount + " withdrawn successfully"
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.println("1. ATM Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");

        try {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    atm.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    atm.withdraw(sc.nextDouble());
                    break;

                case 4:
                    System.out.println(
                        "Thank you for using ATM."
                    );
                    return;

                default:
                    System.out.println("Invalid input");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Transaction process completed.");
            sc.close();
        }
    }
}
