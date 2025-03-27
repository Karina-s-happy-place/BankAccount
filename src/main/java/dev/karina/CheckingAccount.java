package dev.karina;

public class CheckingAccount extends Account {
    private float overdraft;

    public CheckingAccount(float balance, float annualInterestRate, float overdraft) {
        super(balance, annualInterestRate);
        this.overdraft = 0.0f;
    }

    @Override
    public void withdraw(float amount) {
        if (amount <= balance) {
            super.withdraw(amount);
        } else {
            overdraft += amount - balance;
            balance = 0.0f;
            withdrawCount++;
        }
    }

    public float getOverdraft() {
        return overdraft;
    }

}
