package org.example.tiendaapp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextField Nombre;

    @FXML
    private Button Saludar, Limpiar;

    @FXML
    private Text Saludo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        actions();
    }
    public void actions(){
        Saludar.setOnAction(actionEvent -> {
            if (Saludo.getText().isEmpty()) {
                Saludo.setText("No hay nadie a quien saludar");

            } else {
                Saludo.setText(String.format("Enhorabuena %s has completado el reto", Nombre.getText()));
            }
        });
        Limpiar.setOnAction(event->{
            Nombre.clear();
            Saludo.setText("");
        });
    }
}
