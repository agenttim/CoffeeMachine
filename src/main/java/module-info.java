module com.example.coffeemachine {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coffeemachine to javafx.fxml;
    exports com.example.coffeemachine;
    exports com.example.coffeemachine.controller;
    opens com.example.coffeemachine.controller to javafx.fxml;
    exports com.example.coffeemachine.service;
    opens com.example.coffeemachine.service to javafx.fxml;
}