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

    @Override
    public void withdraw(float amount) {
        System.out.println("Before withdraw: " + balance + ", Active status:" + active);
        if (active) {
            super.withdraw(amount);
        } else {
            System.out.println("Account is inactive, cannot withdraw");
        }
        this.active = balance >= 10000.0f;
        System.out.println("After withdraw:" + balance + ", Active statuts:" + active);
    }
}
