package com.ch17;

public class AtmProcessor2 extends Thread {
    void withdrawCash(int accountId, int amount) {
        synchronized (this) {
            boolean allowTransaction = validateWithdrawal(accountId, amount);
            if (allowTransaction) {
                updateBalance(accountId, amount);
            }
        }
    }

    private void updateBalance(int accountId, int amount) {
        System.out.println("");
    }

    private boolean validateWithdrawal(int accountId, int amount) {
        return true;
    }
}
