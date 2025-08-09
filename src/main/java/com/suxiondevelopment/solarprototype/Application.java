package com.suxiondevelopment.solarprototype;

import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    private Stage stage;
    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("login-view.fxml"));
        Scene newScene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setScene(newScene);
        stage.setTitle("ECRC ENERGIZE");
        stage.show();

    }

    public void switchScene(String fxmlFile) throws IOException {

    }


    public static void main(String[] args) {
        launch();
    }
}