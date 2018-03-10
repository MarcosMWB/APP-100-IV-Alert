package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;


public class Controller {

    @FXML
    public TextField cp_Pkm;

    @FXML
    public void pressButton(ActionEvent event) {
        cp_Pkm.setText("????");
    }
}