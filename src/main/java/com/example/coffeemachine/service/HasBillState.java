package com.example.coffeemachine.service;

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

    }

    @Override
    public void pressButton() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/making-coffee.fxml");
    }

    @Override
    public void pourСoffee() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        coffeeMachine.toDisplay("/com/example/coffeemachine/coffee-is-ready.fxml");
    }

    @Override
    public void refill() {

    }


}
