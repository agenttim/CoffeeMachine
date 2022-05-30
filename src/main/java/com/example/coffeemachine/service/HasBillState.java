package com.example.coffeemachine.service;

import javafx.animation.PauseTransition;
import javafx.util.Duration;

import java.util.concurrent.TimeUnit;

public class HasBillState implements State {

    CoffeeMachine coffeeMachine;

    public HasBillState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertBill() {

    }

    @Override
    public void ejectBill() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/bill-return.fxml");
        coffeeMachine.setState(coffeeMachine.getNoBillState());
    }

    @Override
    public void pressButton() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/making-coffee.fxml");
    }

    @Override
    public void takeСoffee() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/goodbye.fxml");
    }


    @Override
    public void refill() {

    }


}
