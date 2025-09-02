package br.com.mariojp.solid.lspaccounts;

public abstract class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
    return balance;
    }

    public void setBalance(double balance){
    this.balance = balance;
    }
}