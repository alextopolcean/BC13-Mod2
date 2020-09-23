package de.telran.application;

import de.telran.dao.Bank;
import de.telran.data.BankAccount;
import de.telran.data.Person;
import de.telran.data.Sex;

import java.util.Date;
import java.util.Arrays;

public class BankApplication {
    public static void main(String[] args) {
        Person client1 = new Person("Ivan", "Ivanov", new Date(2000, 10, 10), "Moskow", Sex.MALE);
        Person client2 = new Person("Petr", "Petrov", new Date(1990, 5, 5), "Moskow", Sex.MALE);
        Person client3 = new Person("Vasilij", "Vasiljev", new Date(1980, 7, 6), "Moskow", Sex.MALE);
        Person client4 = new Person("Misha", "Medvedev", new Date(1987, 9, 4), "Moskow", Sex.MALE);
        Person client5 = new Person("Mascha", "Medvedeva", new Date(1990, 3, 5), "Moskow", Sex.FEMALE);
        Person client6 = new Person("Katja", "Pushkina", new Date(1987, 9, 4), "Moskow", Sex.FEMALE);
        Person client7 = new Person("Lena", "Lenina", new Date(1997, 3, 3), "Moskow", Sex.FEMALE);
        Person client8 = new Person("Jens", "Losse", new Date(1989, 10, 12), "Leipzig", Sex.MALE);
        Person client9 = new Person("Robert", "Schiller", new Date(1987, 7, 8), "Berlin", Sex.MALE);

        BankAccount account1 = new BankAccount(client1, 1500.50);
        BankAccount account2 = new BankAccount(client2, 2600.85);
        BankAccount account3 = new BankAccount(client3, 3700.96);
        BankAccount account4 = new BankAccount(client4, 4800);
        BankAccount account5 = new BankAccount(client5, 5600);
        BankAccount account6 = new BankAccount(client6, 7200.30);
        BankAccount account7 = new BankAccount(client7, 3600.01);
        BankAccount account8 = new BankAccount(client8, 100);
        BankAccount account9 = new BankAccount(client9, 100000);

        Bank myBank = new Bank(100);

        myBank.addAccount(account1);
        myBank.addAccount(account2);
        myBank.addAccount(account3);
        myBank.addAccount(account4);
        myBank.addAccount(account5);
        myBank.addAccount(account6);
        myBank.addAccount(account7);
        myBank.addAccount(account8);
        myBank.addAccount(account9);

        myBank.displayAccount();

        myBank.transferMoney(10100001, 10100004, 200);
        System.out.println("------------------------------");
        myBank.transferMoney(10100001, 10100004, 200);
        System.out.println("------------------------------");
        System.out.println("------------------------------");


        //System.out.println( Arrays.toString(myBank.getClientPerSex(Sex.MALE)));
        System.out.println("Всего аккаунтов: " + myBank.getExistingAccounts().length);
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        System.out.println(".......................");
        System.out.println("Клиенты => мужчины" );
        System.out.println(".......................");
        myBank.displayClientsPerSex(Sex.MALE);
        System.out.println(".......................");
        System.out.println("Клиенты => женщины" );
        System.out.println(".......................");
        myBank.displayClientsPerSex(Sex.FEMALE);
        //myBank.countClientPerSex(Sex.MALE);
        //myBank.countClientPerSex(Sex.FEMALE);
    }
}
