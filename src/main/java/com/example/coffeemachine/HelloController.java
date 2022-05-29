package com.example.coffeemachine;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cappuccinoButton;

    @FXML
    private Button ejectBillButton;

    @FXML
    private Button insertBillButton;

    @FXML
    private Button refillButton;

    @FXML
    void initialize() {

    }

}




/*
package com.example.coffeemachine;

import com.example.coffeemachine.service.CoffeeMachine;
import com.example.coffeemachine.service.HasBillState;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cappuccinoButton;

    @FXML
    private Button latteButton;

    @FXML
    void initialize() {
        cappuccinoButton.setOnAction(event -> new Cappuccino().givOutCappuccino());
        latteButton.setOnAction(event -> {
            latteButton.getScene().getWindow().hide();
            new HasBillState(new CoffeeMachine()).pressButton();
        });
    }

}
*/
