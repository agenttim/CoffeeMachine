package com.example.coffeemachine.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CoffeeMachine {
    State soldOutState;
    State soldState;
    State noBillState;
    State hasBillState;

    State state;
    int count;

    public CoffeeMachine() {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        noBillState = new NoBillState(this);
        hasBillState = new HasBillState(this);

        count = 100;
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
        state.pourСoffee();
    }

    void releaseCoffee() {
        //System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count += count;
        //System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
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
        stage.showAndWait();
    }
}
