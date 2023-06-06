package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();

        bank.depozyt(money);
        System.out.println(bank.depozyt(1000));
    }
}
