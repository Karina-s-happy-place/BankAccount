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
}
