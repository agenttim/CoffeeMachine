package com.example.coffeemachine.service;

import com.example.coffeemachine.service.State;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HasBillState implements State {

    CoffeeMachine coffeeMachine;

    public HasBillState(CoffeeMachine coffeeMachine) {

    }

    @Override
    public void insertBill() {

    }

    @Override
    public void ejectBill() {

    }

    @Override
    public void pressButton() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/example/coffeemachine/cappuccino.fxml"));

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

    @Override
    public void pourСoffee() {

    }

    @Override
    public void refill() {

    }
}
