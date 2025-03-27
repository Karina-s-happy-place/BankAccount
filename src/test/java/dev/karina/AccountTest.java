package dev.karina;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void testDeposit() {
        Accouunt account = new Account(5000.0f, 5.0f);
        account.deposit(2000.0f);
        assertEquals(7000.0f, account.getBalance(), 0.001, "Balance should be update correctly");
        assertEquals(1, account.getDepositCount(), "Deposit count should be incremented");
    }
}
