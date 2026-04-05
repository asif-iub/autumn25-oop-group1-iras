package com.group1.iras;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class SceneSwitcher {
    public static void switchTo(String fxml) throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource(fxml));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}
