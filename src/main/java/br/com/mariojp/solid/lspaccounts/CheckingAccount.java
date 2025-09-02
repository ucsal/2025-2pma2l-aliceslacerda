package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable{

public CheckingAccount (double balance){

    super(balance);
}

@Override
    public void withdraw(double amount) {
        if(amount <= getBalance()){
        setBalance(getBalance() - amount);
        } else {
        throw new IllegalArgumentException("Saldo insuficiente");
    }
}
    }