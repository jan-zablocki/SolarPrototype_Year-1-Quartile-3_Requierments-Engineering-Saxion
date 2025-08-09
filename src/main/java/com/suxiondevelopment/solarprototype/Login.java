package com.suxiondevelopment.solarprototype;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Login {

    //This exists to read user input from a textfield called usernameInput.
    @FXML
    private TextField usernameInput;

    //This field exists so we can manipulate the label box. @FXML is VERY IMPORTANT.
    @FXML
    private Label errorMessage;


    @FXML
    public void loginAs() throws IOException {
        //Clears the error message.
        errorMessage.setText("");
        //Gets the text from the field for the code to use
        if (usernameInput.getText().equals("Consultant") || usernameInput.getText().equals("consultant")){
            //Here we switch the scene for the consultant
            Application app = new Application();
            app.switchScene("consultant-view.fxml");

            System.out.println("You have logged in as a Consultant");
        }else if(usernameInput.getText().equals("Installer") || usernameInput.getText().equals("installer")){
            //Here we switch the scene for the installer
            Application app = new Application();
            app.switchScene("installer-view.fxml");

            System.out.println("You have logged in as an Installer");
        } else if (usernameInput.getText().equals("Planner") || usernameInput.getText().equals("planner")){
            //Here we switch the scene for the planner
            Application app = new Application();
            app.switchScene("planner-view.fxml");

            System.out.println("You have logged in as an Planner");
        } else if (usernameInput.getText().equals("Test") || usernameInput.getText().equals("test")){
            //Here we switch the scene for the test screen. It should not be accessbile to the regular user in normal mode
            Application app = new Application();
            app.switchScene("general-view.fxml");

            System.out.println("You have logged in as an Test.");
        } else {
            //Sets the label to have this message.
            errorMessage.setText("Error, wrong username or password.\nPlease try again or contact the administrator.");

        }


    }
}
