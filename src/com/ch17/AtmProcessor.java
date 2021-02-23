package com.ch17;

public class AtmProcessor extends Thread {
    synchronized void withdrawCash(int accountId, int amount) {
        boolean allowTransaction = validateWithedDrawl(accountId, amount);
        if (allowTransaction) {
            updateBlance(accountId, amount);
        } else {
            System.out.println("not enough money on the account");

        }
    }

    private void updateBlance(int accountId, int amount) {
//        null;
        System.out.println("update your balance with " + amount);
    }

    private boolean validateWithedDrawl(int accountId, int amount) {
        return true;
    }
}
