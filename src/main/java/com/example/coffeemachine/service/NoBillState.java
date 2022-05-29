package com.example.coffeemachine.service;

public class NoBillState implements State {

    CoffeeMachine coffeeMachine;

    public NoBillState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertBill() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/coffee-selection.fxml");
        coffeeMachine.setState(coffeeMachine.getHasBillState());
    }

    @Override
    public void ejectBill() {

    }

    @Override
    public void pressButton() {

    }

    @Override
    public void pourСoffee() {

    }

    @Override
    public void refill() {

    }
}
