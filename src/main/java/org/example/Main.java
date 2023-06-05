package org.example;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.depozyt(1000);
        System.out.println(bank.depozyt(1000));
    }
}