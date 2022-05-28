module com.example.coffeemachine {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coffeemachine to javafx.fxml;
    exports com.example.coffeemachine;
}