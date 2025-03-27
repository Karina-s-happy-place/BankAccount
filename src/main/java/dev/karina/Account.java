package dev.karina;

public class Account {

    protected float balance;
    protected int depositCount = 0;
    protected int withdrawCount = 0;
    protected float annualInterestRate;
    protected float monthlyFee = 0.0f;

    public Account(float balance, float annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(float ammount) {
        balance += ammount;
        depositCount++;
    }

    public float getBalance() {
        return balance;
    }

    public int getDepositCount() {
        return depositCount;
    }

    public void withdraw(float ammount) {
        if (ammount <= balance) {
            balance -= ammount;
            withdrawCount++;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public int getWithdrawalCount() {
        return withdrawCount;
    }

}
