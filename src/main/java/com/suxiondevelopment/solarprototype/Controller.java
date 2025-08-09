package com.suxiondevelopment.solarprototype;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//Whatever you see here, is just as it came. Except for this comment, I've not edited this document.
public class Controller {
    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}