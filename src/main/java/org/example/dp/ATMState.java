package org.example.dp;
public abstract class ATMState {
    //context
    ATMMachine atmMachine;

    abstract void insertCard();
    abstract void ejectCard();
    abstract void insertPin(int pinEntered);
    abstract void requestCash(int cashToWithdraw);
}
