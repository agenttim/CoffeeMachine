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
    private Button latteButton;

    @FXML
    void initialize() {
        cappuccinoButton.setOnAction(event -> new Cappuccino().givOutCappuccino());
    }

}
