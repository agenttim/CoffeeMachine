package com.example.coffeemachine.service;

import com.example.coffeemachine.service.CoffeeMachine;
import com.example.coffeemachine.service.State;

public class SoldOutState implements State {
    CoffeeMachine coffeeMachine;


    public SoldOutState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertBill() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/machine-is-empty.fxml");
    }

    @Override
    public void ejectBill() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/machine-is-empty.fxml");
    }

    @Override
    public void pressButton() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/machine-is-empty.fxml");
    }

    @Override
    public void takeСoffee() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/machine-is-empty.fxml");
    }

    @Override
    public void refill() {
        coffeeMachine.toDisplay("/com/example/coffeemachine/hello-view.fxml");
        coffeeMachine.setState(coffeeMachine.getNoBillState());
    }
}
