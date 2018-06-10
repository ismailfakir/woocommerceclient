package net.cloudcentrik.woocommerceclient.view;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

import java.awt.*;

public class MyLoginController {

    @FXML
    Button buttonLogin;

    @FXML
    TextField userName;

    @FXML
    TextField userPassword;

    @FXML
    Canvas loginCanvas;

    public MyLoginController(){

    }

    @FXML
    public void initialize() {

    }

    @FXML
    public void buttonClicked(Event event){
        ((Button)event.getSource()).getScene().getWindow().hide();
        showAlert();
    }

    public void showAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message Here...");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");
        alert.showAndWait();
    }

}
