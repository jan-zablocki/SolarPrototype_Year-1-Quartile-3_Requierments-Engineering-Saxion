package com.suxiondevelopment.solarprototype.users;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

//This is ALSO template code for the general-view.fxml. Copy and DO NOT edit or use directly withing your code.
public class Consultant {

    //this triggers for a alert box to run. Within it, the user confirms if they want to log out or not.
    @FXML
    protected void requestLogoutAction() {
        //Creates new alert and sets up the parameters like the window name, asking user if they want to log-out and what actions they can take
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Are you sure you want to log out?");
        alert.setContentText("Click OK to log out or Cancel to stay logged in.");

        //This basically makes the code react to user input of pressing the OK button
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                // Performs the log-out action here aka change of scene and "clearing of session data" (aka nothing)
                System.out.println("Logged out successfully!"); //Placeholder text while I try to figure out how to switch scenes
            }
        });
    }

}
