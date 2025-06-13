package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void checkBalanceLimit() {
        if (balance < 100) {
            System.out.println("ბალანსი დაბალია");
        } else {
            System.out.println("ბალანსი ნორმაშია");
        }
    }
}
