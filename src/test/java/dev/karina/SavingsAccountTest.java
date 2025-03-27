package dev.karina;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SavingsAccountTest {
    @Test
    public void testActivation() {
        SavingsAccount account = new SavingsAccount(8000.0f, 5.0f);
        assertFalse(account.isActive(), "Account should be inactive");

        account.deposit(3000.0f);
        assertTrue(account.isActive(), "Account should be activated upon reaching a balance >= 10,000.");
        assertEquals(11000.0f, account.getBalance(), "The balance should be updated correctly after depositing.");
    }

    @Test
    public void testWithdrawWhenActive() {
        SavingsAccount account = new SavingsAccount(12000.0f, 5.0f);
        account.withdraw(3000.0f);
        assertEquals(9000.0f, account.getBalance(), "the balance should reflect the withdrawal");
        assertFalse(account.isActive(), "Account should be inactive with balance < 10,0000.");
    }
}
