package com.example.coffeemachine.service;

import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CoffeeMachine {
    State soldOutState;
    State soldState;
    State noBillState;
    State hasBillState;

    State state;
    int count;

    public CoffeeMachine() {
        soldOutState = new SoldOutState(this);
        noBillState = new NoBillState(this);
        hasBillState = new HasBillState(this);

        count = 3;
        state = noBillState;
    }

    public void insertBill() {
        state.insertBill();
    }

    public void ejectBill() {
        state.ejectBill();
    }

    public void pressButton() {
        state.pressButton();
    }

    public void takeCoffe() {
        state.takeСoffee();
    }

    void releaseCoffee() {
        if (count > 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    public void refill() {
        this.count = count + 3;
        state.refill();
    }

    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoBillState() {
        return noBillState;
    }

    public State getHasBillState() {
        return hasBillState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void toDisplay(String display) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(display));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
