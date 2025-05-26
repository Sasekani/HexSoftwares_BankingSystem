package classes;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private Customer customer;

    public BankAccount(String accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0;
    }
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println ("Deposited: R " + amount);
        }
        else {
            System.out.println ("Invalid deposit amount");
        }

    }
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return false;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: R" + amount);
            return true;
        } else {
            System.out.println("Insufficient funds for withdrawal!");
            return false;
        }
    }

    public double getBalance() {
        return balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Account Nuumber: " + accountNumber +
                "\nCustomer: " + customer.getName() +
                "\nBalance: " + balance;
    }

}
