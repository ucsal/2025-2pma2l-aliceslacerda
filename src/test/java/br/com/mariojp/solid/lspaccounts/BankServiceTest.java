package br.com.mariojp.solid.lspaccounts;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class BankServiceTest {

    @Test
    void checking_account_allows_withdrawal() {
        var account = new CheckingAccount(0.0);
        account.setBalance(100.0);
        new BankService().processWithdrawal(account, 50);
        assertEquals(50, account.getBalance(),0.0001);
    }

    @Test
    void savings_account_should_not_throw_and_should_not_withdraw() {
        var account = new SavingsAccount(0.0);
        account.setBalance(100.0);
        
 assertDoesNotThrow(() -> {

 }, "Após refatoração, processWithdrawal não deve tentar sacar de poupança");
        assertEquals(100, account.getBalance(), 0.0001,
                "Poupança não deve ter saldo reduzido em operação de saque");
    }
}