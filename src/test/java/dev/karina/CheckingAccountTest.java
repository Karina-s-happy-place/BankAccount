package dev.karina;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckingAccountTest {
    @Test
    public void testWithdrawWithOverdraft() {
        CheckingAccount account = new CheckingAccount(5000.0f, 5.0f, 0);
        account.withdraw(7000.0f);
        assertEquals(0.0f, account.getBalance(), 0.001, "Balance should be 0 after overdraft");
        assertEquals(2000.0f, account.getOverdraft(), 0.001, "Overdraft should be 2000.");
    }

    @Test
    public void testDepositReducesOverdraft() {
        CheckingAccount account = new CheckingAccount(5000.0f, 5.0f, 0);
        account.withdraw(7000.0f);
        account.deposit(1500.0f);
        assertEquals(500.0f, account.getOverdraft(), 0.001, "Overdraft should be reduced by 500");
        assertEquals(0.0f, account.getBalance(), 0.001, "The balance must be 0 until the overdraft is paid.");
    }

    @Test
    public void testMonthlyStatement() {
        CheckingAccount account = new CheckingAccount(5000.0f, 5.0f, 0);
        account.withdraw(6000.0f);
        account.deposit(500.0f);
        account.setMonthlyFee(200.0f);
        account.monthlyStatement();

        assertEquals(0.0f, account.getBalance(), 0.01, "Balance should be 0.");
        assertEquals(700.0f, account.getOverdraft(), 0.01, "Overdraft should be the monthly fee. ");
    }

}
