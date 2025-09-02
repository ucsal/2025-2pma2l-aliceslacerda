package br.com.mariojp.solid.lspaccounts;
public class Main {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount(1000);
        SavingsAccount savings = new SavingsAccount(500);
        
        BankService service = new BankService();
        service.processWithdrawal(checking,200);

        System.out.println("Saldo conta correte:" + checking.getBalance());

        System.out.println("Saldo poupança: " + savings.getBalance());
    }
}