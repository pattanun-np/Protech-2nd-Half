package BankInheritance;

import java.util.Random;

public class BankAccount extends SavingsAccount {

    private double balance;
    private String account_number;


    public BankAccount() {

        balance = 0.0;
        account_number = formatAccountNumber(generateAccountNumber());

    }

    public BankAccount(double initialBalance) {
        balance = initialBalance;
        account_number = formatAccountNumber(generateAccountNumber());
    }

    private static String formatAccountNumber(String account_number) {
        String AccountNumber = "";
        String[] temp = account_number.split("");
        AccountNumber = temp[0] + temp[1] + temp[2] + "-" + temp[3] + "-" + temp[4] + temp[5] + temp[6] + temp[7] + temp[8] + "-" + temp[9];

        return AccountNumber;
    }

    private static String generateAccountNumber() {
        StringBuilder AccountNumber = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i <= 10; i++) {
            int randomNum = rand.nextInt((10) + 1);
            AccountNumber.append(String.valueOf(randomNum));

        }
        return AccountNumber.toString();
    }


    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("*** Insufficient Balance ***");
            System.out.println("*** Transaction Denied ***");
        }

    }

    public String getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }
}
