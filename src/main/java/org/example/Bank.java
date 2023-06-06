package org.example;

public class Bank {
    private double bilans = 0;
    public double depozyt(double wplata){
        return bilans = bilans + wplata;
    }
    public double wyplata(double kasa){
        return bilans = bilans - kasa;
    }
}
