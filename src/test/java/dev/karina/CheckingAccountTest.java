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
}
