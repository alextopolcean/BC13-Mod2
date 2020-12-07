package de.telran.data;

import java.util.Objects;

public class BankAccount {
    private int account;
    private Person client;
    private double balance;
    private static int accountsNumber = 10100000;

    public BankAccount(Person client, double balance) {
        account = ++accountsNumber;
        this.client = client;
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public Person getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return getAccount() == that.getAccount() &&
                Double.compare(that.getBalance(), getBalance()) == 0 &&
                getClient().equals(that.getClient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccount(), getClient(), getBalance());
    }

    @Override
    public String toString() {
        return "BankAccount Number: " + account +
                "\n" + client.toStringName() +
                "\n balance: " + balance;
    }

    public void debit(double sum) {
        balance = balance + sum;
    }

    public boolean credit(double sum) {
        if (sum <= balance) {
            balance = balance - sum;
            return true;
        }
        return false;
    }
}
