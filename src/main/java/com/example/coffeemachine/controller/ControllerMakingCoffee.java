package com.example.coffeemachine.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static com.example.coffeemachine.HelloApplication.coffeeMachineGlobal;

public class ControllerMakingCoffee {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cappuccinoButton;

    @FXML
    private Button cappuccinoReadyButton;

    @FXML
    private Button ejectBillButton;

    @FXML
    private Button insertBillButton;

    @FXML
    private Button refillButton;

    @FXML
    void initialize() {
        insertBillButton.setOnAction(event -> {
            insertBillButton.getScene().getWindow().hide();
            coffeeMachineGlobal.insertBill();
        });

        cappuccinoButton.setOnAction(event -> {
            cappuccinoButton.getScene().getWindow().hide();
            coffeeMachineGlobal.pressButton();
        });

        ejectBillButton.setOnAction(event -> {
            ejectBillButton.getScene().getWindow().hide();
            coffeeMachineGlobal.ejectBill();
        });
        cappuccinoReadyButton.setOnAction(event -> {
            cappuccinoReadyButton.getScene().getWindow().hide();
            coffeeMachineGlobal.takeCoffe();
        });
        refillButton.setOnAction(event -> {
            refillButton.getScene().getWindow().hide();
            coffeeMachineGlobal.refill();
        });
    }
}
