package de.telran.dao;

import de.telran.data.BankAccount;
import de.telran.data.Person;
import de.telran.data.Sex;

public class Bank {

    private BankAccount[] accounts;
    private int size;

    public Bank(int capacity) {
        accounts = new BankAccount[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int checkAccount(int account) {
        for (int i = 0; i < size; i++) {
            if (account == accounts[i].getAccount()) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAccount(BankAccount account) {
        if (checkAccount(account.getAccount()) >= 0 || size >= accounts.length) {
            return false;
        }
        accounts[size] = account;
        size++;
        return true;
    }

    public boolean closeAccount(int account) {
        int index = 0;
        if (index < 0) {
            return false;
        }
        accounts[index] = accounts[size - 1];
        size--;
        return true;
    }

    public void displayAccount() {
        for (int i = 0; i < size; i++) {
            System.out.println(accounts[i]);
            System.out.println("---------------------------------");
        }
    }

    public BankAccount[] getExistingAccounts() {
        BankAccount[] allAccounts = new BankAccount[size];
        for (int i = 0; i < size; i++) {
            allAccounts[i] = accounts[i];
        }
        return allAccounts;
    }

    public double getBalanceOfBank() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum += accounts[i].getBalance();
        }
        return sum;
    }

    public boolean transferMoney(int accountFrom, int accountTo, double sum) {
        int indexFrom = checkAccount(accountFrom);
        if (indexFrom < 0) {
            System.out.println("Аккаунт отправителя не найден, попробуйте снова");
            return false;
        }
        int indexTo = checkAccount(accountTo);
        if (indexTo < 0) {
            System.out.println("Аккаунт получателя не найден, попробуйте снова");
            return false;
        }
        if (!accounts[indexFrom].credit(sum)) {
            System.out.println("Трансакция невозможна! Слишком низкий баланс");
            return false;
        }
        accounts[indexTo].debit(sum);
        System.out.println("Ваш баланс составляет: " + accounts[indexFrom].getBalance());
        System.out.println("Ваш перевод выполнен");
        System.out.println(sum + " € переведено " + accounts[indexTo].getClient().toStringName());
        System.out.println("Ваш новый баланс составляет: " + accounts[indexFrom].getBalance());
        return true;
    }

    public int countClientPerSex(Sex sex) {
        int countMale = 0;
        int countFemale = 0;
        for (BankAccount account : getExistingAccounts()) {
            if (Sex.MALE.equals(sex)) {
                countMale++;
                return countMale;
            } else if (Sex.FEMALE.equals(sex)){
                countFemale++;
                return countFemale;
            }

        }
        return countFemale;
    }

    public void displayClientsPerSex(Sex sex) {
        for (BankAccount account : getExistingAccounts()) {
            if (account.getClient().getSex().equals(sex)) {
                System.out.println(account);
                System.out.println("---------------------");
            }
        }
    }

    public Person[] getClientPerSex(Sex sex) {
        int count = 0;
        Person[] clientPerSex = new Person[count];
        for (int i = 0; i < size; i++) {
            if (accounts[i].getClient().getSex().equals(sex)) {
                clientPerSex[count] = accounts[i].getClient();
                count++;
            }
        }
        return clientPerSex;
    }
}
