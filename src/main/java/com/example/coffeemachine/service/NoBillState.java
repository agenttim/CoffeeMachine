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
        coffeeMachine.toDisplay("/com/example/coffeemachine/bill-return-error.fxml");
    }

    @Override
    public void pressButton() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/making-coffee-error.fxml");

    }

    @Override
    public void takeСoffee() {

    }

    @Override
    public void refill() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/machine-is-full.fxml");
    }
}
