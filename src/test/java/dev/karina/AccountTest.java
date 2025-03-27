package dev.karina;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void testDeposit() {
        Account account = new Account(5000.0f, 5.0f);
        account.deposit(2000.0f);
        assertEquals(7000.0f, account.getBalance(), 0.001, "Balance should be update correctly");
        assertEquals(1, account.getDepositCount(), "Deposit count should be incremented");
    }

    @Test
    public void testWidthdraw() {
        Account account = new Account(5000.0f, 5.0f);
        account.withdraw(3000.0f);
        assertEquals(2000.0f, account.getBalance(), 0.001, "Balance should be decrease correctly");
        assertEquals(1, account.getWithdrawalCount(), "Withdrawal count should be incremented");
        account.withdraw(4000.0f);
        assertEquals(2000.0f, account.getBalance(), 0.0001, "Balance should not change os overdraw");
        assertEquals(1, account.getWithdrawalCount(), "Withdrawal count should be incremented on overdraw");
    }

    @Test
    public void testCalculateMonthlyInterest() {
        Account account = new Account(12000.0f, 12.0f);
        account.calculateMonthlyInterest();
        assertEquals(12120.0f, account.getBalance(), 0.001, "Balance should include calculated interest");
    }

    @Test
    public void testMonthlyStatement() {
        Account account = new Account(15000, 6.0f);
        account.setMonthlyFee(200.0f);
        account.deposit(1000.0f);
        account.withdraw(500.0f);
        account.monthlyStatement();
        assertEquals(15376.5f, account.getBalance(), 0.001, "Balance should reflect fees and interest");
        assertEquals(0, account.getDepositCount(), "Deposit count should be reset");
        assertEquals(0, account.getWithdrawalCount(), "Withdrawal count should be reset");

    }

    @Test
    public void testPrint() {
        Account account = new Account(5000.0f, 5.0f);
        account.deposit(2000.0f);
        account.withdraw(1000.0f);
        account.setMonthlyFee(50.0f);

        String expectedOutput = "Balance: 6000.0, Deposit: 1 Withdrawal: 1,Monthly Fee: 50.0";
        assertEquals(expectedOutput, account.print(), "Print method output is incorrect");
    }
}
