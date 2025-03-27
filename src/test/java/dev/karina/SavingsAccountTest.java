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
        assertFalse(account.isActive(), "Account should be inactive with balance < 10,000.");
    }

    @Test
    public void testMonthlyStatement() {
        SavingsAccount account = new SavingsAccount(15000.0f, 5.0f);
        for (int i = 0; i < 6; i++) {
            account.withdraw(1000.0f);
        }
        account.monthlyStatement();
        assertEquals(7029.17f, account.getBalance(), 0.01, "Balance should reflect penalities and interest");
    }

    @Test
    public void testPrint() {
        SavingsAccount account = new SavingsAccount(11000, 5.0f);
        account.deposit(1000.0f);
        account.withdraw(500.0f);
        String expectedOutput = "Balance: 11500.0, Monthly Fee: 0.0, Trasactions: 2";
        assertEquals(expectedOutput, account.print(), "The print method should display the correct output");
    }
}
