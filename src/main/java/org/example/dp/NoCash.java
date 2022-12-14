package org.example.dp;

public class NoCash extends ATMState {


    public NoCash(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have any money");
        System.out.println("Your card is ejected");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have any money");
        System.out.println("There is no card to eject");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have any money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have any money");
    }
}
