package com.example.hellojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class SecondaryView implements Initializable{


    @javafx.fxml.FXML
    private Label info;
    @javafx.fxml.FXML
    private ImageView myImageView;
    @javafx.fxml.FXML
    private TextField textField;
    @javafx.fxml.FXML
    private Button btnSaludar;
    @javafx.fxml.FXML
    private Button btnDespedir;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Override
    public void initialize(URL url,ResourceBundle resourceBundle){

    }

    public void saludar(ActionEvent actionEvent) {
        info.setText("Hola "+txtNombre.getText());
        var alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setContentText(actionEvent.toString());
        alerta.showAndWait();
    }

    public void despedir(ActionEvent actionEvent) {
        info.setText("Hola "+txtNombre.getText());
    }

    @javafx.fxml.FXML
    public void saludar(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void despedir(ActionEvent actionEvent) {
    }
}
