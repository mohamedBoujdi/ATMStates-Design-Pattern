package org.example.dp;
public class ATMMachine {
    //current state of the machine
    ATMState state;

    //possible states of the machine
    private  ATMState hasCard;
    private  ATMState noCard;
    private  ATMState hasCorrectPin;
    private  ATMState atmOutOfMoney;

    //current amount of money in the machine
    int cashInMachine = 2000;

    boolean correctPinEntered = false;
    public  ATMMachine(){
            hasCard = new HasCard(this);
            noCard = new NoCard(this);
            hasCorrectPin = new HasPin(this);
            atmOutOfMoney = new NoCash(this);

            state = noCard;
            if (cashInMachine < 0) {setATMState(atmOutOfMoney); }
    }
    void setATMState(ATMState newATMState) {
            this.state = newATMState;
    }
    public ATMMachine setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
        return this;
    }

    public void insertCard() {state.insertCard();}
    public void ejectCard() {state.ejectCard();}
    public void requestCash(int cashToWithdraw) {state.requestCash(cashToWithdraw);}
    public void insertPin(int pinEntered) {state.insertPin(pinEntered);}


    public ATMState getYesCardState() {return hasCard;}
    public ATMState getNoCardState() {return noCard;}
    public ATMState getHasPin() {return hasCorrectPin;}
    public ATMState getNoCashState() {return atmOutOfMoney;}


    }
