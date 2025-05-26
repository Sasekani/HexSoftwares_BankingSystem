package org.example;

import classes.BankAccount;
import classes.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name: ");
        String name = sc.nextLine();
        System.out.println("Enter customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Customer customer = new Customer(name, id);

        System.out.println("Enter account number: ");
        String accountNumber = sc.nextLine();

        BankAccount account = new BankAccount(accountNumber, customer);

        boolean running = true;
        while (running) {
            System.out.println("\n=== Bank Account Menu ===");
            System.out.println("Customer: " + customer.getName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Current Balance: R" + account.getBalance());
            System.out.println("=========================");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Enter deposit amount: R");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: R" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: R");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Current balance: R" + account.getBalance());
                    break;
                case 3:
                    System.out.println("Current balance: R" + account.getBalance());
                    break;
                case 4:
                    System.out.println("\n=== Account Details ===");
                    System.out.println("Customer Name: " + customer.getName());
                    System.out.println("Customer ID: " + customer.getIdNumber());
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Current Balance: R" + account.getBalance());
                    System.out.println("=======================");
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}