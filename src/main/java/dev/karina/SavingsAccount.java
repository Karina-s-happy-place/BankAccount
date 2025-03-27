package dev.karina;

public class SavingsAccount extends Account {
    private boolean active;

    public SavingsAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
        this.active = balance >= 10000.0f;
    }

    @Override
    public void deposit(float amount) {
        super.deposit(amount);
        this.active = balance >= 10000.0f;
    }

    public boolean isActive() {
        return active;
    }
}
